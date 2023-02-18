package day11.polymorphism;
    // same method
    // different parameter
    // if same parameter, you should change datatype
public class MethodOverLoading {
    static void show(int a) {
        System.out.println(a);
    }
    static void show(double b) {
        System.out.println(b);
    }
    static void show(char c) {
        System.out.println(c);
    }

    static void show(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        show(17);
        show(17.5);
        show('m');
        show("Yan Linn Aung");
    }
}
