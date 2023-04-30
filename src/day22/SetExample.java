package day22;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(343);
        integerSet.add(3);
        integerSet.add(3);
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(9);
        System.out.println(integerSet);
    }
}
