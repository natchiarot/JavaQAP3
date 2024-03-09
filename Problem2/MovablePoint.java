package Problem2;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xs, float ys) {
        super(x, y);
        xSpeed = xs;
        ySpeed = ys;
    }

    public MovablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }   

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        String pointText = super.toString();

        return(pointText + ", speed = (" + xSpeed + "," + ySpeed + ")");
    }

    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);

        return this;
    }
}
