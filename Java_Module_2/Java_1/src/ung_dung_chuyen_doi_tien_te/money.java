package ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class money {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("Nhập 1 để chuyển từ VNĐ sang USD");
            System.out.println("Nhập 2 để chuyển từ USD sang VNĐ");
            menu = sc.nextInt();
        } while (menu != 1 && menu != 2);

        System.out.println("Nhập số tiền cần chuyển: ");
        double money = sc.nextDouble();

        if (menu == 1) {
            System.out.println(money + "VNĐ = " + money / 23000 + "USD");
        } else {
            System.out.println(money + "USD = " + money * 23000 + "VNĐ");
        }
    }
}
