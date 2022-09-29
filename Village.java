package assignment3_000875260;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.Random;

/* this class is used to create the Village */
public class Village {
    private double x, y, size;
    private Color color;
    private String name;
    House house1, house2, house3;

    double space = 0;     // spaces between the houses within the same village.

    public Village(String name, double x, double y, Color color) {     // village constructor
        this.name = name;
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;

        // get random number for the spacing between the houses 20-50
        Random r = new Random();
        space = r.nextInt(50 - 20) + 20;

        // create 3 objects for the 3 houses within the village
        house1 = new House(x, y, 120, color);
        house2 = new House(x + 120 + space, y, 100, color);
        house3 = new House(x + 100 + 120 + space * 2, y, 80, color);
    }


    public void draw(GraphicsContext gc) {

        // draw the 3 houses
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);

        // draw the text below the village
        gc.setFont(new Font("System", 10));
        double villageSize = (house1.getSize() + house2.getSize() + house3.getSize() + space) * 20;  // convert from pixel to cm
        gc.fillText(name + " (" + "size " + villageSize +
                        "cm, population " + (house1.getOccupants() + house2.getOccupants() + house3.getOccupants() + ")"),
                x, y + 140);
    }
}