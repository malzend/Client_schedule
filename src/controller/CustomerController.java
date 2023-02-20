package controller;

import helper.AccountQuery;
import helper.CustomerQuery;
import helper.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Customer;
import model.Model;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class CustomerController implements Initializable{

    @FXML
    private Button addCustomerButton;

    @FXML
    private TableView<Customer> customerTable;
    @FXML
    private TableColumn<Customer, Integer> customerID;
    @FXML
    private TableColumn<Customer, String> address;
    @FXML
    private TableColumn<Customer, String> customerName;

    @FXML
    private TableColumn<Customer, String> phoneNumber;

    @FXML
    private TableColumn<Customer, String> postalCode;

    @FXML
    private Button deleteCustomerButton;
    @FXML
    private Button modifyCusotmerBtton;

    @FXML
    private Button exitButtoon;

    @FXML
    private Button makeAppoitnmentButton;


    @Override
    public void initialize(URL location, ResourceBundle resource) {

        setColumes();


    }

    public void setColumes(){

        customerTable.setItems(Model.getCustomer());
        customerID.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("CustomerID"));
        customerName.setCellValueFactory(new PropertyValueFactory<Customer,String>("CustomerName"));
        address.setCellValueFactory(new PropertyValueFactory<Customer,String>("Address"));
        postalCode.setCellValueFactory(new PropertyValueFactory<Customer,String>("PostalCode"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<Customer,String>("PhoneNumber"));

    }
    @FXML
    void addCustomerAction(ActionEvent event) throws IOException {

        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/AddCustomer.FXML"));
        Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(customerPage,600,400);
        Window.setScene(scene);
        Window.setTitle("Customer Page:");
        Window.show();


    }

    @FXML
    void customerTabelAction(ActionEvent event) {

    }

    @FXML
    void deleteCustomerAction(ActionEvent event) throws SQLException {
        int selectedID = customerTable.getSelectionModel().getSelectedItem().getCustomerID();
        Customer selectedItem = customerTable.getSelectionModel().getSelectedItem();
        System.out.print(selectedItem);
        String processResult= CustomerQuery.customerDelete(selectedID);
        Alert alertType;
        if(processResult == "success"){
            alertType = new Alert(Alert.AlertType.CONFIRMATION);
            alertType.setTitle(" Deleting States");
            alertType.setHeaderText("Deleting was successful");
            alertType.setContentText("You have Delete the selected customer record");
        } else {
            Model.removeCustomer(selectedItem);
            alertType = new Alert(Alert.AlertType.WARNING);
            alertType.setTitle("Deleting States");// line 2
            alertType.setHeaderText(" Delete was not successful");// line 3
            alertType.setContentText("You have not Delete the selected customer record");// line 4
        }
        alertType.show();
    }

    @FXML
    void exitAction(ActionEvent event)throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/User.FXML"));
        Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(customerPage,600,400);
        Window.setScene(scene);
        Window.setTitle("Customer Page:");
        Window.show();

    }

    @FXML
    void makeAppoitmentAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/Appointment.FXML"));
        Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(customerPage,750,400);
        Window.setScene(scene);
        Window.setTitle("Customer Page:");
        Window.show();

    }
    @FXML
    void modifyCusotmerAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/ModifyCustomer.fxml"));
        Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(customerPage,600,400);
        Window.setScene(scene);
        Window.setTitle("Customer Page:");
        Window.show();
    }





}

