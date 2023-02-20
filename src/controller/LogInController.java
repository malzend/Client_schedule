package controller;

import helper.CustomerQuery;
import helper.JDBC;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.TimeZone;


public class LogInController implements Initializable {


    @FXML
    private Button LogIn;

    @FXML
    private TextField passWord;

    @FXML
    private TextField timeZoneTextBox;

    @FXML
    private TextField userName;




    @FXML

    void LogIn(ActionEvent event) throws IOException, SQLException {
        JDBC.openConnection();
        try {
            CustomerQuery.customerData();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        try{
            String uName = userName.getText();
            String password = passWord.getText();

            if(uName.isEmpty() == true && password.isEmpty() == true) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("UserName and Password are empty");
                alert.setContentText("Please enter User name and a password ");
                alert.show();
            }
            else{

                boolean test = helper.LogIn.validateUser(uName,password);

                if(test == true) {
                    Parent customerPage = FXMLLoader.load(getClass().getResource("/View/User.fxml"));
                    Scene scene = new Scene(customerPage, 600, 400);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(scene);
                    window.setTitle("LogIn page:");
                    window.show();

                }
                else {
                    Alert alert1 = new Alert(Alert.AlertType.ERROR);
                    alert1.setTitle("Error");
                    alert1.setHeaderText("You have entered an incorrect credentials ");
                    alert1.setContentText("Please enter User name and a password ");
                    alert1.show();
                }
            }
            }
        catch (NullPointerException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No part selected:");
            alert.setContentText("Please select an item from the available product list to add.");
            alert.show();
        }


}


    @FXML
    void SendpassWord(ActionEvent event) {

    }

    @FXML
    void sendUserName(ActionEvent event) {

    }


    public  void initialize(URL url, ResourceBundle rb){
        String timeZone = TimeZone.getDefault().getDisplayName();
        timeZoneTextBox.setText(timeZone);
        timeZoneTextBox.setEditable(false);
    }
}
