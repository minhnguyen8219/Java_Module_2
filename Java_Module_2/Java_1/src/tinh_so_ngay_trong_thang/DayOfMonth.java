package tinh_so_ngay_trong_thang;

import java.util.Scanner;

public class DayOfMonth {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập vào tháng trong năm: ");
        int month = sc.nextInt();

        switch (month) {
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}


