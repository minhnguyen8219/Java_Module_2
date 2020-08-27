import java.util.Scanner;

public class selectionSort2 {



        public static void main(String[] args) {
            final int size = 4;

            int[] arr = creatArr(size);
            System.out.println("Mảng lúc đầu:");
            printArr(arr);

            selectionSort(arr);

            System.out.println("Mảng sau khi sắp xếp:");
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
            System.out.println();
        }

        static void ínertionSort(int[] arr) {
            int size = arr.length - 1;
            int memo = 0;
            int i, j;
            for (i = 0; i < size - 1; i++) {
                for (j = i; j < size; j++) {
                    if (arr[i] < arr[j]) {
                        memo = arr[i];
                        arr[i] = arr[j];
                        arr[j] = memo;
                    }
                }
            }
        }

        static void selectionSort(int[] arr) {
            int size = arr.length;
            int indexMin, i, j;

            for (i = 0; i < size - 1; i++) {
                indexMin = i;

                for (j = i + 1; j < size; j++) {
                    if (arr[indexMin] > arr[j]) {
                        indexMin = j;
                    }
                }

                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            } }
}
