package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifyCusotmerController {

    @FXML
    private Button addButton;

    @FXML
    private TextField addressTextBox;

    @FXML
    private ComboBox<?> countryTextBox;

    @FXML
    private TextField customerIdTextBox;

    @FXML
    private TextField customerTectBox;

    @FXML
    private Button exitButton;

    @FXML
    private ComboBox<?> firstLevelDivisionCombBox;

    @FXML
    private TextField phoneNumberTextBox;

    @FXML
    private TextField postalCodeTextBox;

    @FXML
    void addressTextBoxAction(ActionEvent event) {

    }

    @FXML
    void coutryTextBoxAction(ActionEvent event) {

    }

    @FXML
    void customerIdTextBoxAction(ActionEvent event) {

    }

    @FXML
    void customerTectBoxAction(ActionEvent event) {

    }

    @FXML
    void exitButtonAction(ActionEvent event) throws IOException {
        Parent userLogOut = FXMLLoader.load(getClass().getResource("/view/Customer.fxml"));
        Stage Windoe = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(userLogOut,731,400);
        Windoe.setScene(scene);
        Windoe.setTitle("Customer page:");
        Windoe.show();


    }

    @FXML
    void firstLevelDivisionTextBoxAction(ActionEvent event) {

    }

    @FXML
    void modifyButtonAction(ActionEvent event) {

    }

    @FXML
    void phoneNumberTextBoxAction(ActionEvent event) {

    }

    @FXML
    void postalCodeTextBoxCtion(ActionEvent event) {

    }

}
