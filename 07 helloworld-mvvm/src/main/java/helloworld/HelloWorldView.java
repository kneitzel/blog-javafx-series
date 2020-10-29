package helloworld;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloWorldView implements FxmlView<HelloWorldViewModel>, Initializable {

    /**
     * Model with our data.
     */
    @InjectViewModel
    private HelloWorldViewModel model;


    /**
     * TextField for name.
     */
    @FXML private TextField nameTextField;

    /**
     * Label for greeting
     */
    @FXML private Label greetingLabel;

    /**
     * Close application.
     * @param e ActionEvent (unused).
     */
    public void closeApplicationAction(final ActionEvent e) {
        model.closeApplication();
    }

    /**
     * Updates Greeting in model.
     * @param e ActionEvent (unused).
     */
    public void updateGreeting(final ActionEvent e) { model.updateGreeting();}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameTextField.textProperty().bindBidirectional(model.nameProperty);
        greetingLabel.textProperty().bind(model.greetingProperty);
    }
}
