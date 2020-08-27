package chuyen_doi_nhiet_do;

import java.util.Scanner;

public class convertTemperature {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        double temp;
        do {
            display_Menu();
            choice = select_Menu();
            if (choice != 0) {
                temp = input_Temp();
                convertTemperature(choice, temp);
            }
        } while (choice != 0);
    }

    static void display_Menu() {
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
    }

    static int select_Menu() {
        System.out.println("Enter your choice:");
        int selected = scanner.nextInt();
        return selected;
    }

    static double input_Temp() {
        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();
        return temp;
    }

    static void convertTemperature(int choice, double temp) {
        if (choice == 1) {
            double celsius = (5.0 / 9) * (temp - 32);
            System.out.println(temp + " Fahrenheit = " + celsius + " Celsius");
        } else {
            double fahrenheit = (9.0 / 5) * temp + 32;
            System.out.println(temp + " Celsius = " + fahrenheit + " Fahrenheit");
        }
    }
}
