package them_phan_tu_vao_mang;

import java.util.Scanner;

public class insertNum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Nhập số cần thêm: ");
        int num = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int index = scanner.nextInt();


        System.out.println("Mảng trước khi thêm:");
        printArr(arr);

        arr = insertNum(arr, num, index);

        System.out.println("Mảng sau khi thêm:");
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + "   ");
        }
        System.out.println();
    }

    static int[] insertNum(int[] arr, int num, int index) {
        int[] arrNew = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                j++;
            }
            arrNew[j] = arr[i];
            j++;
        }
        arrNew[index] = num;
        return arrNew;
    }
}
