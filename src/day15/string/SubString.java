package day15.string;

import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String name = "Yan Linn Aung";
        System.out.println(name.substring(5)); // Delete String

        String[] str = name.split(" ");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(str));
    }
}
