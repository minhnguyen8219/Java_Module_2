package su_dung_toan_tu;

import java.util.Scanner;

public class hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        float a = sc.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        float b = sc.nextFloat();

        System.out.println("Diện tích hình chữ nhật: " + Area(a,b));
        System.out.println("Chu vi hình chữ nhật: " + Perimeter(a,b));

        Perimeter1(a, b);
        Area1(a, b);
    }

    public static float Perimeter(float a, float b) {
        return (a + b) * 2;
    }

    public static float Area(float a, float b) {
        return (a * b);
    }

    public static void Perimeter1(float a, float b) {
        System.out.println("Chu vi hình chữ nhật: " + Perimeter(a,b));
    }

    public static void Area1(float a, float b) {
        System.out.println("Diện tích hình chữ nhật: " + Area(a,b));
    }

}
