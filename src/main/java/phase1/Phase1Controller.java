package phase1;

import Classes.Elderly;
import Classes.Person;
import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
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

    @FXML
    public void initialize() {
        // Create circles and add them to the circlePane


        // Optionally, you can add animations or other functionality here
    }
    public Circle make_circle(Person obj) {
        Circle C1 = new Circle(500, 200, 10, Color.BLACK);
        if (obj.getClass() == Elderly.class) {
            C1.setFill(Color.BROWN);
            return C1;
        }
        return null;

    }

}
