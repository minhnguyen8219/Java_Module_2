package tinh_tong_cac_so_o_cot_co_dinh;

import java.util.Scanner;

public class countRow {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr2x = creatArr2x(5, 5);
        printArr2x(arr2x, 5, 5);

        System.out.print("Tổng các số tại cột ");
        int row = scanner.nextInt();
        System.out.print("là: " + countRow(arr2x, row, 5));

    }

    static int[][] creatArr2x(int width, int height) {
        int[][] arr2x = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                arr2x[i][j] = (int)(Math.random()*100);
            }
        }
        return arr2x;
    }

    static void printArr2x(int[][] arr2x, int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("a[" + i + "," + j + "]= " + arr2x[i][j] + "   ");
            }
            System.out.println("   ");
        }
    }

    static int countRow(int[][] arr2x, int row, int height) {
        int count = 0;
        for (int i = 0; i < height; i++) {
            count += arr2x[i][row-1];
        }
        return count;
    }

}
