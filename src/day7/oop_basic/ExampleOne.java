package day7.oop_basic;

public class ExampleOne {
//    int a = 3; // global variable

    int b = 3; // instance variable

    static int c = 4; // static variable
    public static void main(String[] args) {
        int a = 3; // local variable
        System.out.println(c);
        System.out.println(ExampleOne.c);

        // String Name = New String("Yan Yan")
        ExampleOne obj = new ExampleOne();
        System.out.println(obj.c);
        System.out.println(new ExampleOne().c); // anonymous object
    }
}
