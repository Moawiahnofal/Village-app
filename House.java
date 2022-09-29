package assignment3_000875260;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

/* this class is used to create the house */
public class House {
    private double x, y, size;
    private int occupants;
    private Color color;
    Door door;
    Window window;

    public House(double x, double y, double size, Color color) {     // other houses constructor
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        // get random number for the occupants in the houses 50 - 100
        Random r = new Random();
        this.occupants = r.nextInt(100 - 50) + 50;

        double xWindow = x + 10;         // get x coordinate of the center of the window
        double yWindow = y + 10;         // get y coordinate of the center of the window
        double xDoor = x + size / 2;    // get x coordinate of the centre of the rectangle (house) for the x door coordinate.
        double yDoor = y + size / 2;    // get y coordinate of the centre of the rectangle (house) for the y door coordinate.
        door = new Door();
        door.Gate(xDoor, yDoor, size / 2);
        window = new Window(xWindow, yWindow, size / 5);
    }


    public House(double x, double y) {                     // king's house constructor
        this.x = x;
        this.y = y;
        size = 250;
        occupants = 1;
        color = Color.BLACK;

        double xWindow = x + 10;         // get x coordinate of the center of the window
        double yWindow = y + 10;         // get y coordinate of the center of the window
        double xDoor = x + size / 2;    // get x coordinate of the centre of the rectangle (house) for the x door coordinate.
        double yDoor = y + size / 2;    // get y coordinate of the centre of the rectangle (house) for the y door coordinate.
        door = new Door();              // create door object
        door.Gate(xDoor, yDoor, size / 2);   // set door properties by calling Gate method
        window = new Window(xWindow, yWindow, size / 5);    // create winodw object
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(this.color);           // set the color of the house
        gc.fillRect(x, y, size, size);    // Draw house assume the height = width -> square
        door.draw(gc);                    //Draw door
        window.draw(gc);                  // Draw window
    }

    public int getOccupants() {           // getter method to get the occupants number
        return this.occupants;
    }

    public void setOccupants(int occupants) {   // setter method to ser the occupants number
        this.occupants = occupants;
    }

    public double getSize() {             // getter method to get the size
        return this.size;
    }

}



