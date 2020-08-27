package xao_phan_tu_khoi_mang;

import java.util.Scanner;

public class removePoint {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Nhập số cần xóa: ");
        int num = scanner.nextInt();

        System.out.println("Mảng trước khi xóa:");
        printArr(arr);
        
        arr = removeNum(arr, num);
        
        System.out.println("Mảng sau khi xóa:");
        printArr(arr);
    }
    
    static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + "   ");
        }
        System.out.println();
    }
    
    static int[] removeNum(int[] arr, int num) {
        int[] arrNew = new int[arr.length];
        int i = 0;
        for (int x : arr) {
            if (x != num) {
                arrNew[i] = x;
                i++;
            }
        }

        return arrNew;
    }
}
