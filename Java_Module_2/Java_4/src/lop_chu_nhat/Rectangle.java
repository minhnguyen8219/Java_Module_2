package lop_chu_nhat;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {}
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return (width * height);
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public void display() {
        System.out.println("HCN có cạnh " + width + " và " + height);
    }
}
