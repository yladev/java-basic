package day3.operators;

public class Shift_Operator {
    public static void main(String[] args) {
        //  << >> >>>

        int a = 1; // 0 0 0 1
        System.out.println(a << 2); // Left Shift

        int b = 1;
        System.out.println(2 >> b); // Right Shift

        int c = 8;
        System.out.println(Integer.toBinaryString(c));
        int d = c << 2;
        System.out.println(d); // Left Shift

        int e = 2;
        int f = e >> 2;
        System.out.println(f); // Right Shift

        int g = 8;
        int h =  g >>> 2;
        System.out.println(h); // Unsigned Right Shift

        int num1 = 1;
        System.out.println(num1 >>> 2);
    }
}
