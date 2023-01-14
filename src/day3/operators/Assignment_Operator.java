package day3.operators;

public class Assignment_Operator {
    public static void main(String[] args) {
        //  = == += -= *= /= %=
        int a = 10;
        a += 10;
        System.out.println(a);

        int b = 20;
        b -= 10;
        System.out.println(b);

        int c = 30;
        c = 50;
        System.out.println(c);

        int e = 10;
        e *= 40;
        System.out.println(e);

        int f = 10;
        f /= 5;
        System.out.println(f);

        int g = 100;
        g %= 9;
        System.out.println(g);
    }
}
