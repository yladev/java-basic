package day10.oop.constructor;

public class ParameterizedConstructor {
    static  int a;
    ParameterizedConstructor(int b) {
        System.out.println(b);
        a = b;
    }

    public static void main(String[] args) {
        new ParameterizedConstructor(10);
        System.out.println(a);
    }
}
