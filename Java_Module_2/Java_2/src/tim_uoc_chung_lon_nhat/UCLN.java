package tim_uoc_chung_lon_nhat;

import java.util.Scanner;

public class UCLN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số A: ");
        int a = sc.nextInt();
        System.out.println("Nhập số B: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất!");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }

        System.out.println("Ước chung lớn nhất của 2 số là: " + a);
    }
}
