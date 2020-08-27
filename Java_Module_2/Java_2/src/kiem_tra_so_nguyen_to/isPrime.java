package kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class isPrime {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();

        isPrime(number);
    }
    static void isPrime(int number) {
        if (number < 2) {
            System.out.println(number + " không là số nguyên tố!");
        } else {
            int i = 2;
            boolean check = true;

            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check) {
                System.out.println(number + " là số nguyên tố!");
            } else {
                System.out.println(number + " không là số nguyên tố!");
            }
        }
    }
}
