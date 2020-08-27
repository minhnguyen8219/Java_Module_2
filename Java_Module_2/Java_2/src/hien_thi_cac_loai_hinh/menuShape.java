package hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class menuShape {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        select(login());

    }

    static void menu() {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
    }

    static int login() {
        int choice = scanner.nextInt();
        return choice;
    }

    static void select(int choice) {
        switch (choice) {
            case 1:
//                ractangle();
                menu();
                login();
            case 2:
//                square_triangle();
                menu();
                login();
            case 3:
//                isosceles_triangle();
                menu();
                login();
            case 4:
                break;
            default:
                System.out.println("Nhập lại!");
                menu();
                login();

        }
    }

}
