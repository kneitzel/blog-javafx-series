package helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Application Klasse, die notwendig ist in jedem JavaFX Programm.
 * <p>
 *     Enthält die main Methode und überschreibt mindestens start,
 * </p>
 */
public class HelloWorld extends Application {

    /**
     * Der Einstiegspunkt für unser Programm.
     * <p>
     *     In einer JavaFX Applikation reicht in der Regel ein launch Aufruf.
     * </p>
     * @param args Kommandozeilen Argumente.
     */
    public static void main(final String[] args) {
        launch(args);
    }

    /**
     * Überschriebene Start methode, die von der JavaFX Applikation mit dem Hauptfenster aufgerufen wird.
     * <p>
     *     Sollte dem Hauptfenster ein Inhalt geben und dann das Fenster sichtbar machen.
     * </p>
     * <p>
     *     Wir laden unsere fxml Datei. Der FXMLLoader erstellt dabei auch automatisch die Instanz des Controllers, der
     *     in der fxml Datei angegeben wurde.
     * </p>
     * @param primaryStage Das Hauptfenster.
     * @throws IOException Da Inhalte geladen werden könnten (fxml Datei, Bilder, ...) kann diese Methode eine IOException werfen.
     */
    @Override
    public void start(final Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}