package day14.misc;
class Integer1 extends Object{
    int anInt;
    Integer1 (int str) {
        this.anInt = str;
    }
    @Override
    public String toString() {
        return String.valueOf(anInt);
    }
}

public class CustomWrapperClass {
    public static void main(String[] args) {
        String name = "Yan Linn Aung";
        String name1 = new String("Yan Linn Aung");

        Integer1 obj = new Integer1(4);
        System.out.println(obj);
    }
}