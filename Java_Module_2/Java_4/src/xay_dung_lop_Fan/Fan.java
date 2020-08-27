package xay_dung_lop_Fan;

public class Fan {
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;

    int speed = slow;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {}

    @Override
    public String toString() {
        if (this.isOn()) {
            return "Speed = " + this.speed
                    + ", Color = " + this.color
                    + ", Radius = " + this.radius
                    + ", Fan is on";
        } else {
            return "Color = " + this.color
                    + ", Radius = " + this.radius
                    + ", Fan is off";
        }
    }
}
