package day10.oop.oop;

public class Inheritance {};

    // Single Inheritance

    class A{
        int a = 10;
        int b = 11;
        int c = 12;
    }
    class B extends A{
        int d = 29;
        public static void main(String[] args) {
            B obj = new B();
            System.out.println(obj.a);
            System.out.println(obj.b);
            System.out.println(obj.c);
        }
    }

    // MultiLevel Inheritance
    class C extends B{
        public static void main(String[] args) {
            C object = new C();
            System.out.println(object.d);
        }
    }