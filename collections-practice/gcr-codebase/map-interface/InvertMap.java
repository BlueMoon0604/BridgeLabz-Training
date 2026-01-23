package collections;

import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> original) {
        Map<V, List<K>> result = new HashMap<>();
        for (Map.Entry<K, V> entry : original.entrySet()) {
            result.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return result;
    }
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        System.out.println(invert(input));
    }
}

