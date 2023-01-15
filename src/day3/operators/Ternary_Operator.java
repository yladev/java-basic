package day3.operators;

public class Ternary_Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        String result = (a < b) ? "This is true" : "This is false";
        System.out.println(result);

        if(a > b) {
            System.out.println("This is true");
        }
        else{
            System.out.println("this is false");
        }
    }
}
