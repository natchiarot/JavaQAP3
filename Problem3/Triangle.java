package Problem3;
// Defining a class named Triangle that extends the Shape abstract class
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor for Triangle class
    public Triangle(String name, double a, double b, double c) {
        super(name);
        if (a + b > c && b + c > a && c + a > b) {
        side1 = a;
        side2 = b;
        side3 = c;
        } else {
            System.err.println("Error - Triangle condition was not met.");
            System.exit(1);  // Terminate program with an error code
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

    // Override the computePerimeter method to calculate the perimeter of the triangle
    @Override
    public double computePerimeter() {
        double a = side1;
        double b = side2;
        double c = side3;

        return(a + b + c);
    }

    // Override the computeArea method to calculate the area of the triangle
    @Override
    public double computeArea() {
        double a = side1;
        double b = side2;
        double c = side3;

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));

        return area;
    }
    
}
