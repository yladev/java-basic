package day15.String;

import java.lang.reflect.Array;
import java.util.Arrays;
public class StringExample {
    // String = char sequence
    public static void main(String[] args) {
       String name = "CodeWall";
       String name1 = new String();

       char[] arr = {'C', 'o', 'd', 'e', 'W', 'a', 'l', 'l'};
       String string = new String (arr);
        System.out.println(string);

        char[] array = {'Y', 'L', 'A'};
        String string1 = Arrays.toString(array);
        System.out.println(string1);
        System.out.println(array);

        char[] chars = {'J', 'A'};
        String a = new String(chars);
        System.out.println(a);

        System.out.println("Yan Linn Aung".concat("YLA"));

        System.out.println("Yan Linn Aung".length());

        StringBuilder b = new StringBuilder("Yan");
        b.append(17);
        System.out.println(b);

        System.out.println(String.join(" ", "Yan", "Linn"));

        System.out.println(String.format("%S %S", "Yan", "Linn"));
    }
}