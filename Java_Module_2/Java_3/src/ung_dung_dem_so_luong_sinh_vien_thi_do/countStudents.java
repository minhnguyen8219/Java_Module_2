package ung_dung_dem_so_luong_sinh_vien_thi_do;

import java.util.Scanner;

public class countStudents {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = creatArr(30);
        printArr(arr);
        System.out.println("Số lượng học sinh đã đỗ: " + countStudents(arr));
    }

    static int[] creatArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }

    static void printArr(int[] arr) {
        int i =0;
        for (int x : arr) {
            System.out.print("hs[" + i + "]= " + arr[i] + "   ");
            i++;
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    static int countStudents(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x >= 5) {
                count += 1;
            }
        }
        return count;
    }
}
