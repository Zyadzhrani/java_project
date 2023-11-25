package phase1;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Phase1 extends Application {
    @Override
    public void start(Stage stage) {

        // Create the root container (BorderPane)
        BorderPane root = new BorderPane();

        // Create a layout container (Pane) for the circles
        Pane circlePane = new Pane();

        // Create two circles
        Circle circle = createCircle(Color.RED, 30.0, 1.0, 10);
        Circle circle1 = createCircle(Color.BLACK, 30.0, 1.0, 22);

        // Add the circles to the circlePane
        circlePane.getChildren().addAll(circle, circle1);

        // Create the controller and move the circles
        Phase1Controller controller = new Phase1Controller();
        controller.Circle_move(circle, 3);
        controller.Circle_move(circle1, 30);

        // Set the center of the BorderPane to the circlePane
        root.setCenter(circlePane);

        // Create a scene and set it to the stage
        Scene scene = new Scene(root, 748, 586);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private Circle createCircle(Color color, double centerX, double centerY, double radius) {
        Circle circle = new Circle();
        circle.setFill(color);
        circle.setCenterX(centerX);
        circle.setCenterY(centerY);
        circle.setRadius(radius);
        return circle;
    }

    public static void main(String[] args) {
        launch();
    }
}
