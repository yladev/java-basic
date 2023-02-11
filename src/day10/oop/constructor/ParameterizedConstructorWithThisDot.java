package day10.oop.constructor;

public class ParameterizedConstructorWithThisDot {
    int a;
    int b;

    public ParameterizedConstructorWithThisDot(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ParameterizedConstructorWithThisDot obj = new ParameterizedConstructorWithThisDot(17, 19);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
