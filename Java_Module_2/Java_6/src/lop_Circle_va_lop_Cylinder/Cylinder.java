package lop_Circle_va_lop_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {}
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }
}
