package Problem3;
// Define a class named ShapeDemo to demonstrate the functionality of the Shape hierarchy
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle myCircle = new Circle("Circle", 4.0);
        System.out.println();
        System.out.println(myCircle);
        System.out.println();
        myCircle.setRadius(7.6);
        System.out.println("myCircle after setting the radius to a new value:");
        System.out.println(myCircle);
        System.out.println();
        
        // Creating an Ellipse object
        Ellipse myEllipse = new Ellipse("Ellipse", 5.0, 7.0);
        System.out.println(myEllipse);
        // Proof that the major axes by default has the larger number.
        System.out.println("The value of 'a' is: " + myEllipse.getMajorAxes());
        System.out.println();

        // Creating another Ellipse object
        // Proof that the ellipse will do regular circle calculations when a and b are the same value.
        Ellipse secondEllipse = new Ellipse("Ellipse Two", 8.0, 8.0);
        System.out.println(secondEllipse);
        System.out.println();

        // Creating a Triangle object
        Triangle myTriangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        System.out.println(myTriangle);
        System.out.println();

        // Creating an Equilateral Triangle object
        EquilateralTriangle myEquilateralTriangle = new EquilateralTriangle("Equilateral Triangle", 5, 5, 5);
        System.out.println(myEquilateralTriangle);
        System.out.println();

        // Creating another Triangle object
        // Proof of triangle condition validation working.
        Triangle secondTriangle = new Triangle("Triangle Two", 10.0, 2.0, 1.0);
        System.out.println(secondTriangle);
        System.out.println();

        // Creating another Equilateral Triangle object
        // Proof of Equilateral Triangle condition validation working.
        EquilateralTriangle secondEquilateralTriangle = new EquilateralTriangle("Equilateral Triangle Two", 6, 5, 5);
        System.out.println(secondEquilateralTriangle);
        System.out.println();
    }
}
