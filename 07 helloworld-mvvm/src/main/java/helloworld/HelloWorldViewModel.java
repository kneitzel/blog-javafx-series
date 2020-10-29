package helloworld;

import de.saxsys.mvvmfx.ViewModel;
import helloworld.entity.Greeting;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Our Model for Hello World.
 */
public class HelloWorldViewModel  implements ViewModel {

    /**
     * Our Model to use.
     */
    private Greeting greeting;

    /**
     * Greeting to show.
     */
    public StringProperty greetingProperty = new SimpleStringProperty();
    public StringProperty nameProperty = new SimpleStringProperty("Bitte Namen eingeben");

    public HelloWorldViewModel() {
        greeting = new Greeting("Welt");
        updateViewModel();
    }

    /**
     * Updates the greeting to use the name given.
     */
    public void updateGreeting() {
        if (nameProperty.get().length() > 0) {
            greeting.greetName(nameProperty.get());
            nameProperty.setValue("Bitte Namen eingeben");
        } else {
            greeting.greetName("Welt");
        }

        updateViewModel();
    }

    /**
     * Updates the ViewModel when Model was changed.
     */
    protected void updateViewModel() {
        greetingProperty.setValue(greeting.getGreeting());
    }

    /**
     * Close application.
     */
    public void closeApplication() {
        System.exit(0);
    }
}
