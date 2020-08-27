package xay_dung_lop_QuadraticEquation;

import java.util.Scanner;

public class ptbac2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 1 Ax + B = C");
        System.out.println("Nhap A:");
        int A = scanner.nextInt();
        System.out.println("Nhap B:");
        int B = scanner.nextInt();
        System.out.println("Nhap C:");
        int C = scanner.nextInt();

        QuadraticEquation ptbac2 = new QuadraticEquation(A, B, C);
        double delta = ptbac2.getDiscriminant();
        if (delta > 0) {
            System.out.println("root 1:" + ptbac2.getRoot1());
            System.out.println("root 2:" + ptbac2.getRoot2());
        } else if (delta < 0){
            System.out.println("“The equation has no roots”");
        } else {
            System.out.println("The equation has root = " + ptbac2.getRoot2());
        }
    }
}
