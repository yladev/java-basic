package day3.operators;

public class Bitwise_Operator {
    public static void main(String[] args) {
        // Bitwise AND &
        int num1 = 6;
        int num2 = 3;
        int result = num1 & num2;
        System.out.println(result);


        // Bitwise OR |
        int num3 = 2;
        int num4 = 1;
        int answer = num3 | num4;
        System.out.println(answer);


        // Bitwise XOR ^
        int num5 = 5;
        int num6 = 7;
        int res = num5 ^ num6;
        System.out.print(res);

        // Bitwise Complement
        int a = 35;
        int b = ~ a;
        System.out.println(b);
    }
}
