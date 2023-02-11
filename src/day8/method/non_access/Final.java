package day8.method.non_access;

public class Final {

    static final double Pi = 3.14;
    public static int a = 10;
    public static void main(String[] args) {
        a = 20; // direct re
        System.out.println(a + Pi);
    }
}
// var
// method