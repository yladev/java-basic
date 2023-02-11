package day9.constructor_oop;

public class ProtectedConstructor {
    protected ProtectedConstructor() {
        System.out.println("Constructor is working");
    }

    public static void main(String[] args) {
        new ProtectedConstructor();
    }
}
