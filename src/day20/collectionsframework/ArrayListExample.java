package day20.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Mg Yan Linn Aung");
        list1.add("Mg Mg");
        list1.add("Mg Aung");
        list1.add("Ma May");
        list1.add("Ma Su");
        System.out.println(list1);

        List<String> maleList = list1;
        List<String> femaleList = new ArrayList<>();
        femaleList.addAll(list1);

        list1.removeIf(s -> {
            if (s.contains("Ma"))
                return true;
            else
                return false;
        });
        System.out.println(list1);

        femaleList.removeIf(s -> {
            if (s.contains("Mg"))
                return true;
            else
                return false;
        });
        System.out.println(femaleList);

        femaleList.removeAll(maleList);
        System.out.println(femaleList);
    }
}