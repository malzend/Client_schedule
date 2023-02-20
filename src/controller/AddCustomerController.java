package controller;

import helper.CustomerQuery;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Customer;
import model.Model;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddCustomerController implements Initializable {

    @FXML
    private Button addButton;

    @FXML
    private TextField addressTextBox;

    @FXML
    private ComboBox<?> countryTextBox;

    @FXML
    private TextField customerIdTextBox;

    @FXML
    private TextField customerTextBox;

    @FXML
    private ComboBox<?> firstLevelDivisionCombBox;

    @FXML
    private TextField phoneNumberTextBox;

    @FXML
    private TextField postalCodeTextBox;

   static int idCustomer;

    static {
        try {
            idCustomer = Model.incrementID();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @FXML
   public void initialize(URL location, ResourceBundle resource) {


       customerIdTextBox.setText(String.valueOf(idCustomer));


    }



    @FXML
    void addButtonAction(ActionEvent event) throws IOException, SQLException {



        Customer customer = new Customer();
        String customerName = customerTextBox.getText();
        String address = addressTextBox.getText();
        String postalCode = addressTextBox.getText();
        String phoneNumber = phoneNumberTextBox.getText();
        int customerID = customer.getCustomerID();
        String firstLevelDivisionCombBoxText = (String) firstLevelDivisionCombBox.getSelectionModel().getSelectedItem();
        String country = (String) countryTextBox.getSelectionModel().getSelectedItem();
        String processResult =  CustomerQuery.customerAdd( idCustomer, customerName, address,postalCode, phoneNumber);

        if(processResult.equals("Success") ){
            Model.addCustomer(new Customer(idCustomer
                    ,customerName,address,postalCode,phoneNumber));
         Alert alertType= new Alert(Alert.AlertType.CONFIRMATION);
         alertType.setTitle(" Info Inserting States");
         alertType.setHeaderText("Insert was successful");
         alertType.setContentText("You have Inserted a new customer record");
         alertType.show();

        } else {


            Alert alertType=new Alert(Alert.AlertType.WARNING);
            alertType.setTitle("Info Inserting  States");// line 2
            alertType.setHeaderText("Insert was not successful");// line 3
            alertType.setContentText("The new customer Insertion failed");// line 4
            alertType.show();
        }
        //Model.addCustomer(new Customer(customerID, customerName, address,postalCode, phoneNumber));

    }

    @FXML
    void addressTextBoxAction(ActionEvent event) {



    }

    @FXML
    void coutryTextBoxAction(ActionEvent event) {

    }

    @FXML
    void customerIdTextBoxAction(ActionEvent event) throws SQLException {


    }

    @FXML
    void customerTectBoxAction(ActionEvent event) {

    }

    @FXML
    void firstLevelDivisionTextBoxAction(ActionEvent event) {

    }

    @FXML
    void phoneNumberTextBoxAction(ActionEvent event) {

    }

    @FXML
    void postalCodeTextBoxCtion(ActionEvent event) {

    }
    @FXML
    void exitButtonAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/Customer.FXML"));
        Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(customerPage,731,400);
        Window.setScene(scene);
        Window.setTitle("Customer Page:");
        Window.show();
    }

}
