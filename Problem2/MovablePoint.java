package Problem2;

public class MovablePoint extends Point {
    // Declaring private instance variables
    private float xSpeed = 0.0f;  // Speed of x
    private float ySpeed = 0.0f;  // Speed of y

    // Constructor for MovablePoint class
    public MovablePoint(float x, float y, float xs, float ys) {
        // Call the constructor of the superclass (Point)
        super(x, y);
        // Initializing the speeds
        xSpeed = xs;
        ySpeed = ys;
    }

    // Default constructor with no parameters
    public MovablePoint() {

    }

    // Getters
    public float getxSpeed() {
        return xSpeed;
    }   

    public float getySpeed() {
        return ySpeed;
    }

    // Setters
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Setter method to set both speeds
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter method to return an array containing both speeds
    public float[] getSpeed() {
        return new float[] {this.xSpeed, this.ySpeed};
    }

    // Override the toString method
    @Override
    public String toString() {
        // Call the toString method of the superclass (Point) and store the result
        String pointText = super.toString();

        return(pointText + ", speed = (" + xSpeed + "," + ySpeed + ")");
    }

    // Method to move the movable point by adding the speed to its coordinates
    public MovablePoint move() {
        // Update the coordinates by adding the speeds
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);

        // Return the updated MovablePoint object
        return this;
    }

}
