package Problem2;
// Define a class named PointDemo to demonstrate the usage of Point and MovablePoint classes
public class PointDemo {
    public static void main(String[] args) {
        // Testing Point class
        Point point1 = new Point(3.0f, 5.5f);
        System.out.println();
        System.out.println("Testing Point class");
        System.out.println();

        System.out.println("Point 1: " + point1);

        System.out.println("X coordinate of Point 1: " + point1.getX());
        System.out.println("Y coordinate of Point 1: " + point1.getY());

        point1.setXY(5.0f, 8.2f);
        System.out.println("Updated Point 1: " + point1);
        System.out.println();

        // Testing MovablePoint class
        System.out.println("Testing MovablePoint class:");
        System.out.println();

        MovablePoint mPoint1 = new MovablePoint(6.0f, 7.0f, 1.0f,2.0f);
        System.out.println("Movable Point 1: " + mPoint1);
        System.out.println("X speed of MovablePoint 1: " + mPoint1.getxSpeed());
        System.out.println("Y speed of MovablePoint 1: " + mPoint1.getySpeed());
        mPoint1.setXY(8.0f, 9.0f);

        // Moving MovablePoint 1
        mPoint1.setSpeed(3.0f, 4.0f);
        System.out.println("Updated Movable Point 1: " + mPoint1);
        mPoint1.move();
        System.out.println("After moving, Movable Point 1: " + mPoint1);
        System.out.println();
    }
}
