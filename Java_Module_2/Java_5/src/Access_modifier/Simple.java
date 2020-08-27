package Access_modifier;

public class Simple {
    public static void main(String[] args) {
        A obj = new A();

//        System.out.println(obj.data);
//        obj.msg();
    }
}

class A {
    private int data = 40;
    private void msg() {
        System.out.println("Hello java");
    }
}
