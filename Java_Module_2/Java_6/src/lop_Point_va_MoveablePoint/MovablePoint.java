package lop_Point_va_MoveablePoint;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint() {}
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super.setXY(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(x);
        setYSpeed(y);
    }

    public float[] getSpeed() {
        float[] Speed = new float[2];
        Speed[0] = xSpeed;
        Speed[1] = ySpeed;
        return Speed;
    }

    @Override
    public String toString() {
        return "(" + x + ", y" + "), " +
               "speed = (" + xSpeed + ", " + ySpeed + ")";
    }

    public void move() {
        this.x += xSpeed;
        this.y += ySpeed;
//        return this;
    }
}
