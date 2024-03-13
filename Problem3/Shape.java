package Problem3;
// Defining an abstract class named Shape
public abstract class Shape {
    // Declare a private instance variable
    private String name;

    // Constructor for Shape class
    public Shape(String name) {
        this.name = name;
    }
    
    // Abstract method to compute the perimeter of the shape
    public abstract double computePerimeter();

    // Abstract method to compute the area of the shape
    public abstract double computeArea();

    // Getter
    public String getName() {
        return name;
    }

    // toString method
    public String toString() { 
        // Round the computed perimeter and area to two decimal places
        double roundedPerimeter = Math.round(computePerimeter() * 100.0) / 100.0;
        double roundedArea = Math.round(computeArea() * 100.0) / 100.0;

        return("The shape " + name + " has a perimeter of " + roundedPerimeter + " and an area of " + roundedArea);
    }
    
}
