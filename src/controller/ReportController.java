package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportController {

    @FXML
    private Button ScheduleForEachContactButton;

    @FXML
    private Button exiteButton;

    @FXML
    private Button totaleCustomerButton;

    @FXML
    private Button whatToDoButton;

    @FXML
    void ScheduleForEachContactButton(ActionEvent event) {

    }

    @FXML
    void exitButtonAction(ActionEvent event) throws IOException {
        Parent customerPage = FXMLLoader.load(getClass().getResource("/View/User.FXML"));
        Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(customerPage,600,400);
        Window.setScene(scene);
        Window.setTitle("Report Page:");
        Window.show();
    }

    @FXML
    void totaleCustomerAction(ActionEvent event) {

    }

    @FXML
    void whatToDoButtonAaction(ActionEvent event) {

    }

}
