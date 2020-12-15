package helloworld;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class HelloWorldController {

    /**
     * Model with our data.
     */
    private HelloWorldModel model = new HelloWorldModel();

    /**
     * Gets our model.
     * @return Our model.
     */
    public HelloWorldModel getModel() { return model; }

    /**
     * Close application.
     * @param e ActionEvent (unused).
     */
    public void closeApplicationAction(final ActionEvent e) {
        Platform.exit();
    }

    /**
     * Updates Greeting in model.
     * @param e ActionEvent (unused).
     */
    public void updateGreeting(final ActionEvent e) { model.updateGreeting();}
}
