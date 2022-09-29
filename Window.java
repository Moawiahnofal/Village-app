package assignment3_000875260;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/* this class is used to create the window */
public class Window {
    private double x, y, diameter;

    public Window(double x, double y, double diameter) {      // Window constructor
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void draw(GraphicsContext gc) {         // method to draw the window
        gc.setFill(Color.WHITE);                   // set color of the window
        gc.fillOval(x, y, diameter, diameter);     // draw the window (oval)
    }

}
