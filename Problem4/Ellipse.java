package Problem4;
// Define a class named Ellipse that extends the shape abstract class
public class Ellipse extends Shape {
    // Declaring private instance variables
    private double majorAxes;  // Major axes
    private double minorAxes;  // Minor axes

    // Constructor for Ellipse class
    public Ellipse(String name, double a, double b) {
        super(name);
        if (a < b) {
            // Assign larger value to the major axes and smaller value to minor axes
            this.majorAxes = b;
            this.minorAxes = a;
        } else {
            // Assign 'a' to the major axes and 'b' to the minor axes
            this.majorAxes = a;
            this.minorAxes = b;
        }
    }

    // Getters
    @Override
    public String getName() {
        return super.getName();
    }

    public double getMajorAxes() {
        return majorAxes;
    }

    public double getMinorAxes() {
        return minorAxes;
    }

    // Setters
    public void setMajorAxes(double majorAxes) {
        this.majorAxes = majorAxes;
    }

    public void setMinorAxes(double minorAxes) {
        this.minorAxes = minorAxes;
    }

    // Override the computePerimeter method to calculate the perimeter of the Ellipse
    @Override
    public double computePerimeter() {
        double perimeter;
        // Check if the major and minor axes are equal (if the ellipse is a circle)
        if (majorAxes == minorAxes) {
            double diameter = majorAxes;
            double radius = diameter/2;
            perimeter = 2*Math.PI*radius;
        } else {
            // If the ellipse is not a circle, calculate the perimeter using provided formula
            double a = majorAxes;
            double b = minorAxes;
            perimeter = Math.PI*Math.sqrt(2*(Math.pow(a, 2) + (Math.pow(b, 2))) - (Math.pow((a - b), 2))/2);
        }

        return perimeter;
    }

    // Override the computeArea method to calculate the area of the ellipse
    @Override
    public double computeArea() {
        double area;
        if (majorAxes == minorAxes) {
            // Check if the major and minor axes are equal (if the ellipse is a circle)
            double diameter = majorAxes;
            double radius = diameter/2;
            area = Math.PI*Math.pow(radius, 2);
        } else {
            // If the ellipse is not a circle, calculate the area using provided formula
            double a = majorAxes;
            double b = minorAxes;
            area = Math.PI*a*b;
        }
        return area;
    }

    // Overide the scale method to scale the major and minor axes of the ellipse by given scalingFactor
    @Override
    public void scale(double scalingFactor) {
        majorAxes = majorAxes * scalingFactor;
        minorAxes = minorAxes * scalingFactor;
    }
    
}
