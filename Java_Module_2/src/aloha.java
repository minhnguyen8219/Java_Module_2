public class aloha {

    public static void main(String[] args) {
        String school = " abc";
        Student A = new Student();
        Student B = new Student();


        System.out.println(A.school);
        System.out.println(B.school);

        Student.school = "THPT Luong Van Can";

        System.out.println(A.school);
        System.out.println(B.school);
    }
}

class Student {
    public static String school = "THPT Hoang Hoa Tham";
}