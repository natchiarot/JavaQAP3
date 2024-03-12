package Problem4;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computePerimeter() {
        return(2*Math.PI*radius);
    }

    @Override
    public double computeArea() {
        return(Math.PI*Math.pow(radius, 2));
    }

    @Override
    public void scale(double scalingFactor) {
        radius = scalingFactor * radius;
    }
    
}
