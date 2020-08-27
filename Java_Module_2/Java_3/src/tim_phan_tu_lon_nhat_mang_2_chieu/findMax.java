package tim_phan_tu_lon_nhat_mang_2_chieu;

import java.util.Scanner;

public class findMax {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr2x = creatArr2x(3, 3);
        printArr2x(arr2x, 3, 3);
        findMax(arr2x, 3, 3);


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

    static void findMax(int[][] a, int width, int height) {
        int max = a[0][0];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                };
            }
        }
        System.out.println("Max là: " + max);
    }
}
