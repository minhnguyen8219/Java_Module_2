package ung_dung_doc_so_thanh_chu;

import java.util.ArrayList;
import java.util.Scanner;

public class NumToText {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> str = new ArrayList<>();

    public static void main(String[] args) {
        int num;
        do {
            System.out.println("Nhập vào 1 số x, 0 <= x <= 1000");
            num = scanner.nextInt();
        } while (num >= 1000 || num <= 0);

        dictionary();

        System.out.println(num + " trong tiếng Anh là: " + str.get(num));
    }

    static void dictionary() {

        //Từ 0 đến 10
        str.add("zero");
        str.add("one");
        str.add("two");
        str.add("three");
        str.add("four");
        str.add("five");
        str.add("six");
        str.add("seven");
        str.add("eight");
        str.add("nine");
        str.add("ten");

        //Từ 11 đến 13
        str.add("eleven");
        str.add("twelve");
        str.add("thirteen");

        //Từ 14 đến 19
        int i = 14;
        do{
            int cache = i % 10;
            str.add(str.get(cache) + "teen");
            i++;
        } while (i < 20);

        //Từ 20 đến 29
        str.add("twenty");
        i++;
        do {
            int cache = i % 10;
            str.add("twenty-" + str.get(cache));
            i++;
        } while (i < 30);

        //Từ 30 đến 39
        str.add("thirty");
        i++;
        do {
            int cache = i % 10;
            str.add("thirty-" + str.get(cache));
            i++;
        } while (i < 40);

        //Từ 40 đến 49
        str.add("forty");
        i++;
        do {
            int cache = i % 10;
            str.add("forty-" + str.get(cache));
            i++;
        } while (i < 50);

        //Từ 50 đến 59
        str.add("fifty");
        i++;
        do {
            int cache = i % 10;
            str.add("fifty-" + str.get(cache));
            i++;
        } while (i < 60);

        //Từ 60 đến 69
        str.add("sixty");
        i++;
        do {
            int cache = i % 10;
            str.add("sixty-" + str.get(cache));
            i++;
        } while (i < 70);

        //Từ 70 đến 79
        str.add("seventy");
        i++;
        do {
            int cache = i % 10;
            str.add("seventy-" + str.get(cache));
            i++;
        } while (i < 80);

        //Từ 80 đến 89
        str.add("eighty");
        i++;
        do {
            int cache = i % 10;
            str.add("eighty-" + str.get(cache));
            i++;
        } while (i < 90);

        //Từ 90 đến 99
        str.add("ninety");
        i++;
        do {
            int cache = i % 10;
            str.add("ninety-" + str.get(cache));
            i++;
        } while (i < 100);

        //Từ 100 đến 999
        str.add("one hundred");
        i++;
        do {
            if (i % 100 == 0) {
                str.add(str.get(i / 100) + " hundred");
            } else {
                int cache = i % 100;
                str.add(str.get((i / 100) * 100) + " and " + str.get(cache));
            }
            i++;
        } while (i < 1001);

        //1000
        str.add("one thousand");
    }
}
