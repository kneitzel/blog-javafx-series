package helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

/**
 * Controller Klasse für das HelloWorld Fenster.
 * <p>
 *     Das Fenster ist in HelloWorld.fxml beschrieben. In FXML Datei wird diese Klasse als Controller angegeben,
 *     so daß die Instanz automatisch erzeugt wird.
 * </p>
 * <p>
 *     Es wird von uns selbst keine Instanz dieses Controllers erzeugt!
 * </p>
 */
public class HelloWorldController {

    /**
     * "greet me" Knopf
     * <p>
     *     Dieser wird automatisch nach der Erzeugung der Instanz vom FXML Loader gesetzt.
     * </p>
     */
    @FXML private Button greetMeButton;

    /**
     * CloseApplicationAction
     * <p>
     *     Diese Methode beendet die Anwendung. Durch den ActionEvent Parameter hat die Methode die
     *     Signatur, die notwendig ist, damit die Methode im FXML beim close Knopf eingetragen werden kann.
     * </p>
     * @param e ActionEvent Parameter.
     */
    public void closeApplicationAction(final ActionEvent e) {
        System.exit(0);
    }

    /**
     * Methode zum Anzeigen eines Grusses.
     * <p>
     *     Mit dieser Methode wird das hinzufügen eines ActionListeners im Code gezeigt.
     *     (Siehe initialize Methode!)
     * </p>
     * @param e ActionEvent Parameter.
     */
    public void handleGreetMeButton(final ActionEvent e) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Hallo Anwender!", ButtonType.OK);
        alert.showAndWait();
    }

    /**
     * Initialisierung des Controllers.
     * <p>
     *     Durch die @FXML Annotation wird diese Methode automatisch aufgerufen, nachdem die Instanz erzeugt und die
     *     Instanzvariablen, die eine @FXML Annotation haben, gesetzt sind.
     * </p>
     * <p>
     *     Wir setzen den ActionHandler für den greetMeButton auf die handleGreetMeButton Methode.
     * </p>
     */
    @FXML
    public void initialize() {
        greetMeButton.setOnAction(this::handleGreetMeButton);
    }
}
