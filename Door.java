package assignment3_000875260;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


/* this class is used to create the door */
public class Door {
    private double x, y, height;

    public void Gate(double x, double y, double height) {    // method to set the Door properties
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public void draw(GraphicsContext gc) {   // method to draw the Door
        gc.setFill(Color.WHITE);             // set door color = white
        double width = height / 2;           // set width as half as the hight
        gc.fillRect(x, y, width, height);    // create the door
    }

}
