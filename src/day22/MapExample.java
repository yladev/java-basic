package day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(3, 200);

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "Jason Andrew");
        stringMap.put(2, "Yan Linn Aung");

        Map map1 = new HashMap();
        map1.put("name", "JA");
        map1.put("age", 17);
        map1.put("relation", false);

        System.out.println(map1);

        Map map2 = new HashMap();
        map2.put("name", "JA");
        map2.put("age", 17);
        map2.put("relation", false);

        System.out.println(map2);

        Map map3 = new HashMap();
        map3.put("name", "JA");
        map3.put("age", 17);
        map3.put("relation", false);

        System.out.println(map3);
    }
}
