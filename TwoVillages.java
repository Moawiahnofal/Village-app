package assignment3_000875260;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.*;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Moawial Nofal
 */
public class TwoVillages extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1100, 600); // Set canvas Size in Pixels
        stage.setTitle("Two Village App"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
        scene.setFill(BLUE);                                                               // set field color = blue

        Village village1 = new Village("Beszel", 20, 20, Color.RED);          // create an object for the first village
        village1.draw(gc);                                                                //draw the first village
        Village village2 = new Village("Moawiah Village", 200, 300, PINK);    // create an object for the second village
        village2.draw(gc);                                                                // draw the second village

        House houseKing = new House(750,200);    // build king house
        houseKing.draw(gc);                            // draw king house

        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
