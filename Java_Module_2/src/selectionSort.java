import java.util.Scanner;

class test {
    public static void main(String[] args) {
        final int size = 10;

        System.out.println("Mảng lúc đầu:");
        int[] arr = creatArr(size);
        printArr(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        selectionSort(arr);
        printArr(arr);
    }

    static int[] creatArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + "   ");
        }
        System.out.println();
    }

    static void selectionSort(int[] arr) {
        int size = arr.length;
        int memo = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] < arr[j]) {
                    memo = arr[i];
                    arr[i] = arr[j];
                    arr[j] = memo;
                }
            }
        }
    }
}