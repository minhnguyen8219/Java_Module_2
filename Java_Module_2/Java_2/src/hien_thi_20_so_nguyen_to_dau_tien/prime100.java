package hien_thi_20_so_nguyen_to_dau_tien;

public class prime100 {
    public static void main(String[] args) {
        int number = 2;

        do {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
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