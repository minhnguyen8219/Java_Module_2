package dao_nguoc_phan_tu_mang;

import java.util.Scanner;

public class ReverseArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = creatArray(20);
        int[] arr2 = reverseArray(arr1);
    }

    static int[] creatArray(int size) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        return arr;
    }

    static int[] reverseArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i <= (size / 2); i++ ) {
            int tg = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = tg;
        }
        return arr;
    }
}
