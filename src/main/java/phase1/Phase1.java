package phase1;

import Classes.Elderly;
import javafx.animation.Interpolator;
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
import javafx.scene.layout.StackPane;
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
        Parent fxmlRoot = new FXMLLoader().load(getClass().getResource("/PHASE.fxml"));
        // Create the controller and move the circles
        Phase1Controller controller = new Phase1Controller();
        Elderly E1 = new Elderly("A",11,null);
        Circle c12 = controller.make_circle(E1);
        Group root = new Group(); //Creating a Group
        root.getChildren().add(fxmlRoot);





        root.getChildren().add(c12);

        // Create a path transition
        Line straightLine = (Line) root.lookup("#Line1");
        Line line = new Line(-100,0,-100,500);
        PathTransition pathTransition = new PathTransition();
        pathTransition.setNode(c12);
        pathTransition.setPath(straightLine);
        pathTransition.setInterpolator(Interpolator.LINEAR);
        pathTransition.setCycleCount(PathTransition.INDEFINITE); // Repeat indefinitely
        pathTransition.setDuration(Duration.seconds(1)); // Duration for one cycle

        // Start the animation
        pathTransition.play();




        // Create a scene and set it to the stage
        Scene scene = new Scene(root);
        stage.setTitle("Team 1");
        stage.setResizable(true); // Display the Resizable
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
