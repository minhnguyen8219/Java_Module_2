package giai_phuong_trinh_bac_nhat;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Giải phương trình Ax + B = C");

        System.out.println("Nhập A: ");
        float a = sc.nextFloat();
        System.out.println("Nhập B: ");
        float b = sc.nextFloat();
        System.out.println("Nhập C: ");
        float c = sc.nextFloat();

        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            float x = (c - b) / a;
            System.out.println("Phương trình có nghiệm là: " + x);
        }
    }
}
