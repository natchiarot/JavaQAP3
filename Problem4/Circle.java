package Problem4;
// Defining a class named Circle that extends the Shape abstract class
public class Circle extends Shape {
    // Declaring a private instance variable
    private double radius;

    // Constructor for Circle class
    public Circle(String name, double radius) {
        // Calling the constructor of the superclass(Shape)
        super(name);
        this.radius = radius;
    }

    // Getters
    @Override
    public String getName() {
        // Calling the getName method of the superclass (Shape)
        return super.getName();
    }

    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override the computePerimeter method to calculate the perimeter of the circle
    @Override
    public double computePerimeter() {
        return(2*Math.PI*radius);
    }

    // Override the computeArea method to calculate the area of the circle
    @Override
    public double computeArea() {
        return(Math.PI*Math.pow(radius, 2));
    }

    // Override the scale method to scale the circle by a given scalingFactor
    @Override
    public void scale(double scalingFactor) {
        // Scale the radius of the circle by the given scalingFactor
        radius = scalingFactor * radius;
    }
    
}
