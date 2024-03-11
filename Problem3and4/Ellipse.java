package Problem3and4;

public class Ellipse extends Shape {

    private double majorAxes;  // Major axes
    private double minorAxes;  // Minor axes

    public Ellipse(String name, double a, double b) {
        super(name);
        if (a < b) {
            this.majorAxes = b;
            this.minorAxes = a;
        } else {
            this.majorAxes = a;
            this.minorAxes = b;
        }
    }

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

    public void setMajorAxes(double majorAxes) {
        this.majorAxes = majorAxes;
    }

    public void setMinorAxes(double minorAxes) {
        this.minorAxes = minorAxes;
    }

    @Override
    public double computePerimeter() {
        double perimeter;

        if (majorAxes == minorAxes) {
            double diameter = majorAxes;
            double radius = diameter/2;
            perimeter = 2*Math.PI*radius;
        } else {
            double a = majorAxes;
            double b = minorAxes;
            perimeter = Math.PI*Math.sqrt(2*(Math.pow(a, 2) + (Math.pow(b, 2))) - (Math.pow((a - b), 2))/2);
        }

        return perimeter;
    }

    @Override
    public double computeArea() {
        double area;
        if (majorAxes == minorAxes) {
            double diameter = majorAxes;
            double radius = diameter/2;
            area = Math.PI*Math.pow(radius, 2);
        } else {
            double a = majorAxes;
            double b = minorAxes;
            area = Math.PI*a*b;
        }
        return area;
    }
    
}
