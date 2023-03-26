package day19.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        Object Arr1[] = {1, "Andrew", true};
        int Arr2[] = new int[3];
        Arr2[0] = 1;

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(2);

        System.out.println(list);
        System.out.println(list.size()); // search length

        List list2 = Arrays.asList(3, "jason", 4.5, true);
        System.out.println(list2.size());

        List<String> list3 = new ArrayList<>();
        list3.add("JA");
        list3.add("YLA");
        list3.add("TTH");
        System.out.println(list3);

        list3.add(1, "YY");
        System.out.println(list3);

        list3.remove(1);
        System.out.println(list3);
    }
}