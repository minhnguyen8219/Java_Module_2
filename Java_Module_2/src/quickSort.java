public class quickSort {
    public static void main(String[] args) {
        int[] x = creatArr(10);
        printArr(x);

        int left = 0;
        int right = x.length - 1;

        quickSort(x, left, right);
        printArr(x);
    }

    public static void quickSort(int[] arr, int left, int right) {

        int middle = left + (right - left) / 2;
        int pivot = arr[middle];
        int i = left, j = right;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(arr, left, j);

        if (right > i)
            quickSort(arr, i, right);
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
}
