package helloworld.entity;

public class Greeting {
    private String greeting;

    public Greeting() {
        greeting = "Hallo Welt!";
    }

    public Greeting(final String name) {
        greetName(name);
    }

    public String getGreeting() { return greeting; }

    public void greetName(final String name) {
        if (name == null || name.isEmpty()) {
            greeting = "Hallo Welt!";
        } else {
            greeting = "Hallo " + name + "!";
        }
    }
}
