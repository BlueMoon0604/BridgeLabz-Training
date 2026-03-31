package collections;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfElements {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String str : list) {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }
        return freqMap;
    }
    public static Map<String, Long> countFrequencyStream(List<String> list) {
        return list.stream()
                   .collect(Collectors.groupingBy(
                       str -> str,
                       Collectors.counting()
                   ));
    }
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("kiwi", "dragon fruit", "grapes", "orange");
        
        System.out.println("Input: " + fruits);
        System.out.println("Iterative result: " + countFrequency(fruits));
        System.out.println("Stream result: " + countFrequencyStream(fruits));
    }
}

