package helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class HelloWorldController {

    @FXML private Button greetMeButton;

    public void closeApplicationAction(final ActionEvent e) {
        System.exit(0);
    }

    public void handleGreetMeButton(final ActionEvent e) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Hallo Anwender!", ButtonType.OK);
        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        greetMeButton.setOnAction(this::handleGreetMeButton);
    }
}
