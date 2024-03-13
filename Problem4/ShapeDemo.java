package Problem4;
// Defining a class named ShapeDemo to demonstrate the functionality of scaling objects
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating an array of Scalable objects
        Scalable[] objects = new Scalable[] {
        new Circle("Circle", 4.0),
        new Ellipse("Ellipse", 5.0, 7.0),
        new Triangle("Triangle", 3.0, 4.0, 5.0),
        new EquilateralTriangle("Equilateral Triangle", 5, 5, 5)
        };

        // Defining scalingFactor
        double scalingFactor = 2.0;

        // Calling main method to take Scalable[] and scalingFactor as parameters
        main(objects, scalingFactor);
    }   

    // Overloaded main method to accept Scalable[] and scalingFactor as parameters
    public static void main(Scalable[] objects, double scalingFactor) {
        // Iterate over the array of Scalable objects
        for (Scalable obj : objects) {
            System.out.println("Before scaling: " + obj);

            // Scale the object
            obj.scale(scalingFactor);

            System.out.println("After scaling: " + obj);
        }
    }
}
