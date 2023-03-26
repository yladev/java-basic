package day19.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAddition {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = Arrays.asList("d", "e", "f", "g");

        list1.addAll(list2);
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);
    }
}