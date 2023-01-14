package day3.operators;

public class Logical_Operator {
    public static void main(String[] args) {
        //  AND OR NOT
        //  &&  || !

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a<b && a<c);
        System.out.println(a<b || a<c);
        System.out.println(!(a<b || a<c));
    }
}
