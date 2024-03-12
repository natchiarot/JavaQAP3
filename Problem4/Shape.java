package Problem4;

public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computePerimeter();

    public abstract double computeArea();

    public String getName() {
        return name;
    }

    public String toString() { 
        double roundedPerimeter = Math.round(computePerimeter() * 100.0) / 100.0;
        double roundedArea = Math.round(computeArea() * 100.0) / 100.0;

        return("The shape " + name + " has a perimeter of " + roundedPerimeter + " and an area of " + roundedArea);
    }
    
}
