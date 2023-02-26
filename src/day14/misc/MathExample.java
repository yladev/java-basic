package day14.misc;

public class MathExample {
    public static void main(String[] args) {
        double random = Math.random() * 100;
        int result = (int) random;
        System.out.println(result);

        System.out.println(Math.pow(2, 6));
        System.out.println(Math.multiplyExact(15, 3));
        System.out.println(Math.incrementExact(19));
    }
}