package tim_gia_tri_trong_mang;

import java.util.ArrayList;
import java.util.Scanner;

public class findStudent {
    static Scanner scanner = new Scanner(System.in);
//    public static ArrayList<String> str = new ArrayList<>();

    public static void main(String[] args) {
        String[] student = creatList();

        System.out.println("Nhập tên cần tìm: ");
        String name = scanner.nextLine();

        isExit(student, name);

    }

    static String[] creatList() {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        return student;
    }

    static void isExit(String[] students, String input_name) {
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vị trí của tên " + input_name + " trong danh sách là: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("không tìm thấy tên " + input_name + " trong danh sách.");

    }
}
