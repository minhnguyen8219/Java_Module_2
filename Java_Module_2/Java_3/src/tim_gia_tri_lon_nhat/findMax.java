package tim_gia_tri_lon_nhat;

import java.util.Scanner;

public class findMax {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numList = creatArray(20);
        printArray(numList);

        int Max = findMax(numList);
        System.out.println("Giá trị lớn nhất trong mảng là: " + Max);
    }

    static int[] creatArray(int size) {
        int[] randomInt = new int[20];
        for (int i = 0; i < 20; i++) {
            randomInt[i] = (int)(Math.random()*100);
        }
        return randomInt;
    }

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.println("a[ " + i + " ]= " + arr[i]);
        }
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
