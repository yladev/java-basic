package day6;

public class Fibo {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + num2);


        int num3;
        int count = 20;
        for(int i = 2; i < count; i ++) {
            num3 = num1 + num2;
            System.out.println("" + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
