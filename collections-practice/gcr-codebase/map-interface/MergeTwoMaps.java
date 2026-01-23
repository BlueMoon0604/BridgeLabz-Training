package collections;

import java.util.*;

public class MergeTwoMaps {
    public static <K> Map<K, Integer> merge(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> result = new HashMap<>(map1);
        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        System.out.println(merge(map1, map2));
    }
}
