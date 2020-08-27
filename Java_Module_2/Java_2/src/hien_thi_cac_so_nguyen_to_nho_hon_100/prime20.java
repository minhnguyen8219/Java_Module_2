package hien_thi_cac_so_nguyen_to_nho_hon_100;

public class prime20 {
    public static void main(String[] args) {
        int count = 1;
        int i = 2;

        do {
            if (isPrime(i)) {
                System.out.println(count + ": " + i);
                count++;
            }
            i++;
        } while (count <= 20);
    }

    static boolean isPrime(int number) {
        int i = 2;
        boolean check = true;

        while (i < Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
