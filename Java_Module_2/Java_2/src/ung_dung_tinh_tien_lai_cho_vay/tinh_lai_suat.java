package ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class tinh_lai_suat {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số tiền gửi:");
        double money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi:");
        int month = sc.nextInt();
        System.out.println("Nhập lãi suất gửi:");
        double interest_rate = sc.nextDouble();

        double total_interest = 0;

        for (int i = 0; i < month; i++) {
            total_interest += money * (interest_rate/100)/12 * month;
        }

        System.out.println("Tổng lãi sau " + month + " tháng gửi là: " + total_interest);
    }
}
