package Problem3and4;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Circle", 4.0);
        System.out.println();
        System.out.println(myCircle);
        System.out.println();
        
        Ellipse myEllipse = new Ellipse("Ellipse", 5.0, 7.0);
        System.out.println(myEllipse);
        System.out.println();
        // Proof that the major axes by default has the larger number.
        System.out.println("The value of 'a' is: " + myEllipse.getMajorAxes());

        // Proof that the ellipse will do regular circle calculations when a and b are the same value.
        Ellipse secondEllipse = new Ellipse("Ellipse Two", 8.0, 8.0);
        System.out.println(secondEllipse);
        System.out.println();

        Triangle myTriangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        System.out.println(myTriangle);
        System.out.println();

        // Proof of triabngle condition validation working.
        Triangle secondTriangle = new Triangle("Triangle Two", 10.0, 2.0, 1.0);
        System.out.println(secondTriangle);
        System.out.println();

        EquilateralTriangle myEquilateralTriangle = new EquilateralTriangle("Equilateral Triangle", 5, 5, 5);
        System.out.println(myEquilateralTriangle);
        System.out.println();

        EquilateralTriangle secondEquilateralTriangle = new EquilateralTriangle("Equilateral Triangle Two", 6, 5, 5);
        System.out.println(secondEquilateralTriangle);
        System.out.println();
    }
}
