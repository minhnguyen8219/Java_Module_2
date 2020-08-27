package lop_chu_nhat;

import java.util.Scanner;

public class hcn {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle();
        hcn1.setHeight(10);
        hcn1.setWidth(5);

        hcn1.display();
        System.out.println("diện tích: " + hcn1.getArea());
        System.out.println("chu vi: " + hcn1.getPerimeter());
    }
}
