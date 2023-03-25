package day18.fromrecording;

interface calculate{
    void Math (int a, int b);
}

public class Eg2 {
    public static void main(String[] args) {
        calculate obj = (a, b) -> System.out.println(a + b);
        obj.Math(8, 9);
        calculate obj2 = (a, b) -> System.out.println(a * b);
        obj2.Math(2, 5);
    }
}