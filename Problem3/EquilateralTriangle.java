package Problem3;
// Define a class named EquilateralTriangle that extends the Shape abstract class
public class EquilateralTriangle extends Shape {
    // Declare private instance variables
    private double side1;
    private double side2;
    private double side3;

    // Constructor for EquilateralTriangle class
    public EquilateralTriangle(String name, double a, double b, double c) {
        super(name);
        // Check if all sides are equal (means it is an equilateral triangle)
        if (a == b && b == c) {
            side1 = a;
            side2 = b;
            side3 = c;
        } else {
            // If all sides are not equal print an error message and exit program
            System.err.println("Error - Equilateral Triangle must have equal sides.");
            System.exit(1);
        }
    }

    // Getters
    @Override
    public String getName() {
        return super.getName();
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Override the computePerimeter method to calculate the perimeter of the equilateral triangle
    @Override
    public double computePerimeter() {
        double a = side1;
        double perimeter = 3 * a;

        return(perimeter);
    }

    // Override the computeArea method to calculate the area of the equilateral triangle
    @Override
    public double computeArea() {
        double a = side1;
        return(Math.sqrt(3)/4 * Math.pow(a, 2));
    }

}
