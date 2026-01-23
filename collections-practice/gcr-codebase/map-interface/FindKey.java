package collections;

import java.util.*;

public class FindKey {
    public static <K> K findMaxValueKey(Map<K, Integer> map) {
        return map.entrySet().stream()
                  .max(Map.Entry.comparingByValue())
                  .map(Map.Entry::getKey)
                  .orElse(null);
    }
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 20, "B", 10, "C", 65);
        System.out.println(findMaxValueKey(map));
    }
}
