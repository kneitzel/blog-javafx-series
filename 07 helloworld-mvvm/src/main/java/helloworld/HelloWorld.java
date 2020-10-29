package helloworld;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorld extends Application {

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws IOException {
        primaryStage.setTitle("Hello World Application");
        ViewTuple<HelloWorldView, HelloWorldViewModel> viewTuple = FluentViewLoader.fxmlView(HelloWorldView.class).load();
        Parent root = viewTuple.getView();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}