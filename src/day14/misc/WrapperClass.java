package day14.misc;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 17;
        int b = 777777;
        String name = "Jason Andrew";

        Integer integer = 4;
        Float floatOne = 7.0f;

        Integer integer1 = a; // Autoboxing
        int num = integer1; // Unboxing

        String str = integer.toString();
        String str1 = String.valueOf(integer);

        Integer integer2 = Integer.valueOf(str);
        int integer3 = Integer.parseInt(str1);

        System.out.println(new WrapperClass());
    }
}
