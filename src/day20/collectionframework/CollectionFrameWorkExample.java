package day20.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionFrameWorkExample {
    // List
    // Set
    // Map
    public static void main(String[] args) {
        int[] intArray = new int[3];
        Integer a = 55;
        System.out.println(a.toString().length());

        List<String> stringList = new ArrayList<>();
        stringList.add("Name");
        stringList.add("Age");
        stringList.add("Height");
        stringList.add("Gender");
        System.out.println(stringList);

        List<String> listOfStr = Arrays.asList("YLA", "JA", "YY");
        stringList.addAll(3, listOfStr);
        System.out.println(stringList); // addAll

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        System.out.println(stringList);

        stringList.retainAll(listOfStr);
        System.out.println(stringList); // retainAll

//        stringList.removeAll(listOfStr);
//        System.out.println(stringList); // removeAll

        System.out.println(stringList.contains("YLA")); // contain


//        stringList.add(2, "Status");
//        System.out.println(stringList); // add
//
//        stringList.set(2, "Relationship");
//        System.out.println(stringList); // set
//
//        System.out.println(stringList.get(3)); // get
//
//        System.out.println(stringList.indexOf("Height")); // indexOf
    }
}