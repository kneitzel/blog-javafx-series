package helloworld;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Our Model for Hello World.
 */
public class HelloWorldModel {

    /**
     * Name of the User.
     */
    private StringProperty name = new SimpleStringProperty();
    /**
     * Sets the name and also the greeting.
     * @param name Name to greet!
     */
    public void setName(final String name) {
        this.name.setValue(name);
    }

    public String getName() { return name.get(); }

    public StringProperty nameProperty() { return name; }

    /**
     * Greeting to show.
     */
    private StringProperty greeting = new SimpleStringProperty();
    public void setGreeting(final String greeting) {
        this.greeting.setValue(greeting);
    }
    public String getGreeting() { return greeting.get(); }
    public StringProperty greetingProperty() { return greeting; }

    public HelloWorldModel() {
        setGreeting("Hallo Welt!");
    }

    /**
     * Updates the greeting to use the name given.
     */
    public void updateGreeting() {
        if (name.get().length() > 0) {
            greeting.setValue("Hallo " + name.get() + "!");
            name.setValue("Bitte Namen eingeben");
        } else {
            greeting.setValue("Hallo Welt!");
        }
    }
}
