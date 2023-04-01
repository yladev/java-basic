package day20.collectionframework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(2, 3, 4, 6, 7, 8, 8);
        Stream<Integer> streamList = list2.stream();
        Stream<Integer> evenStream = streamList.filter(integer -> {
            if (integer % 2 == 0)
                return true;
            else
                return false;
        });

        List<Integer> result = evenStream.collect(Collectors.toList());
        System.out.println(result);

        List<Integer> result2 = list2.stream().filter(i ->{if (i % 2 == 0) return false; return true;}).collect(Collectors.toList());
        System.out.println(result2);
    }
}