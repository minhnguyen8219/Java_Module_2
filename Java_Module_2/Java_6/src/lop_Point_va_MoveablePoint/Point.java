package lop_Point_va_MoveablePoint;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point() {}
    public Point(float x, float y) {
        setXY(x, y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] getXY = {getX(), getY()};
        return getXY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
