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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifyAppointment {

    @FXML
    private TextField UserIDText;

    @FXML
    private Button addButton;

    @FXML
    private TextField appoiitmentDescription;

    @FXML
    private TextField appoitntmentIDText;

    @FXML
    private ComboBox<?> contactAppointmentCombBox;

    @FXML
    private TextField customerIDText;

    @FXML
    private TextField endDateText;

    @FXML
    private VBox endTimeText;

    @FXML
    private TextField endtTimeText;

    @FXML
    private Button exitButton;

    @FXML
    private TextField locationAppointmentText;

    @FXML
    private TextField startDateText;

    @FXML
    private TextField startTimeText;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextField typeAppointmentText;

    @FXML
    void UserIDTextAction(ActionEvent event) {

    }

    @FXML
    void appoiitmentDescriptionTextAction(ActionEvent event) {

    }

    @FXML
    void appointmentButtonAction(ActionEvent event) {

    }

    @FXML
    void appointmentIDTextAction(ActionEvent event) {

    }

    @FXML
    void appointmentexitButtonAction(ActionEvent event) throws IOException {
        Parent userLogOut = FXMLLoader.load(getClass().getResource("/view/Appointment.fxml"));
        Stage Windoe = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(userLogOut,800,400);
        Windoe.setScene(scene);
        Windoe.setTitle("Customer page:");
        Windoe.show();
    }

    @FXML
    void contactCombBoxAction(ActionEvent event) {

    }

    @FXML
    void customerIDTextAction(ActionEvent event) {

    }

    @FXML
    void endDateTextAction(ActionEvent event) {

    }

    @FXML
    void endTimeTextAction(MouseEvent event) {

    }

    @FXML
    void endTimetText(ActionEvent event) {

    }

    @FXML
    void locationAppointmentTextAction(ActionEvent event) {

    }

    @FXML
    void startDateTextActiom(ActionEvent event) {

    }

    @FXML
    void startTimeTextAction(ActionEvent event) {

    }

    @FXML
    void titleTextAction(ActionEvent event) {

    }

    @FXML
    void typeAppointmentTextAction(ActionEvent event) {

    }

}
