package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class AppointmentController {

    @FXML
    private Button addAppointmentButton;

    @FXML
    private Button exitModifyButton;

    @FXML
    private Button modifyAppointmentButton;

    @FXML
    private TableView<?> modifyAppointmentTable;

    @FXML
    private Button mofitydeleteButton;

    @FXML
    void addAppointmentAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/AddAppointment.fxml"));
        Scene scene = new Scene(customerPage,600,521);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setTitle("LogIn page:");
        window.show();

    }

    @FXML
    void exitButtonAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/User.fxml"));
        Scene scene = new Scene(customerPage,600,400);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setTitle("LogIn page:");
        window.show();

    }

    @FXML
    void modfiyAppointmentAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/ModifyAppointment.fxml"));
        Scene scene = new Scene(customerPage,600,521);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setTitle("LogIn page:");
        window.show();

    }

    @FXML
    void modifyAppointmentAction(ActionEvent event) {

    }

    @FXML
    void modifydeleteAction(ActionEvent event) {

    }

}
