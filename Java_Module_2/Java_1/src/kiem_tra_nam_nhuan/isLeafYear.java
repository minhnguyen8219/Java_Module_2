package kiem_tra_nam_nhuan;

import java.util.Scanner;

public class isLeafYear {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập năm cần kiểm tra: ");
        int year = sc.nextInt();

        boolean isLeafYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeafYear = true;
                } else {
                    isLeafYear = true;
                }
            }
        }

        if (isLeafYear) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không là năm nhuận");
        }

    }
}
