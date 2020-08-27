package tinh_chi_so_can_nang_co_the;

import java.util.Scanner;

public class BMI {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao: ");
        double height = scanner.nextDouble();
        System.out.println("Nhập vào cân nặng: ");
        double weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        System.out.println("Heigth = " + height + ". Weight = " + weight + ". BMI = " + bmi );
    }
}
