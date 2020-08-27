package gop_mang;

import java.util.Scanner;

public class mergeArr {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = creatArray(10);
        printArray(arr1);

        int[] arr2 = creatArray(10);
        printArray(arr2);

        int[] arr3 = mergeArr(arr1, arr2);
        printArray(arr3);
    }

    static int[] creatArray(int size) {
        int[] randomInt = new int[size];
        for (int i = 0; i < size; i++) {
            randomInt[i] = (int)(Math.random()*100);
        }
        return randomInt;
    }

    static void printArray(int[] arr) {
        int size = arr.length;
        System.out.print("Mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "]= " + arr[i] + "   ");
        }
        System.out.println();
    }

    static int[] mergeArr(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = size1 + size2;
        int[] arr3 = new int[size3];

        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = size1; i < size3; i++) {
            arr3[i] = arr2[i - size1];
        }

        return arr3;
    }
}
