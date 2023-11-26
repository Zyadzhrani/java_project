package phase1;

import Classes.Elderly;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Phase1 extends Application {
    @Override
    public void start(Stage stage) throws InterruptedException, IOException {

        // Create the root container (AnchorPane)
        Parent root = new FXMLLoader().load(getClass().getResource("/PHASE.fxml"));
        // Create the controller and move the circles
        Phase1Controller controller = new Phase1Controller();
        Elderly E1 = new Elderly("A",11,null);
        Circle c12 = controller.make_circle(E1);





        // Create a scene and set it to the stage
        Scene scene = new Scene(root);
        stage.setTitle("Team 1");
        stage.setResizable(false); // Display the Resizable
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
