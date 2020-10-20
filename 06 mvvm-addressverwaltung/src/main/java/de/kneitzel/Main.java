package de.kneitzel;

import de.kneitzel.gui.addresslist.AddressListView;
import de.kneitzel.gui.addresslist.AddressListViewModel;
import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Application class for the address management.
 */
public class Main extends Application {
    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws IOException {
        primaryStage.setTitle("Hello World Application");
        ViewTuple<AddressListView, AddressListViewModel> viewTuple = FluentViewLoader.fxmlView(AddressListView.class).load();
        Parent root = viewTuple.getView();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
