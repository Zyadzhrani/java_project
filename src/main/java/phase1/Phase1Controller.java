package phase1;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Phase1Controller {

    @FXML
    public Line LINE1;

    @FXML
    private Pane circlePane;

    @FXML
    private Button Stat_stop;

    @FXML
    private void handleStopButton() {
        System.out.println("QTR");
        // Add your code to stop the process or perform any other action
    }

    // Other methods and variables can be added here
    public  void Circle_move(Circle circle,int speed){

        Line path = new Line(-79, 200, -79, -150);


        // Create a path transition
        PathTransition pathTransition = new PathTransition();
        pathTransition.setNode(circle);
        pathTransition.setPath(path);
        pathTransition.setInterpolator(javafx.animation.Interpolator.LINEAR);
        pathTransition.setCycleCount(PathTransition.INDEFINITE); // Keep the animation running indefinitely
        pathTransition.setDuration(Duration.seconds(speed));
        pathTransition.play();

    }

}
