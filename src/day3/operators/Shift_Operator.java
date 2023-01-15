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

        int num1 = 2;
        int num2 = num1 >> 2;
        System.out.println(num2); // Right Shift

        int number1 = 8;
        int number2 =  number1 >>> 2;
        System.out.println(number2); // Unsigned Right Shift
    }
}
