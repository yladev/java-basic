package day22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionFrameWork {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,3,7,3,99,100,8,66);
        Collections.sort(integers);
        System.out.println(integers);
        Collections.reverse(integers);
        System.out.println(integers);
        
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                }
                return -1;
            }
        });
    }
}
