package day15.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String name = "Yan Linn Aung";
        System.out.println(name.substring(5));

        String[] str = name.split(" ");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(str));
    }
}
