package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number that you want to delete:");

        boolean b = true;
        while(b) {String a = s.next();
            if (a.equals("stop")) {
                b = false;
            } else {
                Integer integer = Integer.parseInt(a);
                list2.addAll(Collections.singleton(integer));
                list.removeAll(list2);
                System.out.println(list);
            }
        }
    }
}