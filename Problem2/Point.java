package Problem2;

public class Point {
    // Declaring private instance variables
    private float x = 0.0f;  // x coordinate
    private float y = 0.0f;  // y coordinate
    
    // Constructor for Point class
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor with no parameters
    public Point() {

    };

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Setter method to set both the x and y coordinates of the point
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter method to return an array containing both the x and y coordinates of the point
    public float[] getXY() {
        return new float[] {this.x, this.y};
    }

    // toString method
    public String toString() {
        return("(" + x + "," + y + ")");
    }

}
