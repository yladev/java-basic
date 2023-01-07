package day2.Operators;

public class Logical_Op {
    public static void main(String[] args) {
        boolean bool1=true,
        bool2=false;

        //And &&//
        System.out.println(bool1 && bool2);

        //Or ||//
        System.out.println(bool1 || bool2);

        //Not !//
        System.out.println(!bool1);

        System.out.println(!(bool1 && bool2));
    }
}
