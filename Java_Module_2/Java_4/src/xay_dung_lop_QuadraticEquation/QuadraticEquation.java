package xay_dung_lop_QuadraticEquation;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {}
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        double r1;
        if (delta >= 0){
            r1 = (-b + Math.pow(delta, 0.5))/(2 * a);
        } else {
            r1 = 0;
            System.out.println("“The equation has no roots”");
        }
        return r1;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        double r2;
        if (delta >= 0){
            r2 = (-b - Math.pow(delta, 0.5))/(2 * a);
        } else {
            r2 = 0;
            System.out.println("“The equation has no roots”");
        }
        return r2;
    }
}
