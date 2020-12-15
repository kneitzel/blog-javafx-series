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

    /**
     * Gets the name.
     * @return Name.
     */
    public String getName() { return name.get(); }

    /**
     * Gets the nameProperty.
     * @return Property of name.
     */
    public StringProperty nameProperty() { return name; }

    /**
     * Greeting to show.
     */
    private StringProperty greeting = new SimpleStringProperty();

    /**
     * Sets the Greeting.
     * @param greeting Greeting to set.
     */
    public void setGreeting(final String greeting) {
        this.greeting.setValue(greeting);
    }

    /**
     * Gets the Greeting.
     * @return Greeting.
     */

    public String getGreeting() { return greeting.get(); }

    /**
     * Gets the greeting property.
     * @return Greeting property.
     */
    public StringProperty greetingProperty() { return greeting; }

    /**
     * Creates a new instance of HelloWorldModel.
     */
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
