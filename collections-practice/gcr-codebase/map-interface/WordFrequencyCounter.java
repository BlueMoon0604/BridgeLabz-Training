package collections;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        return Arrays.stream(text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+"))
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.groupingBy(s -> s, Collectors.summingInt(s -> 1)));
    }
    public static void main(String[] args) {
        String text = "Whale is very big creature";
        System.out.println(countWordFrequency(text));
    }
}

