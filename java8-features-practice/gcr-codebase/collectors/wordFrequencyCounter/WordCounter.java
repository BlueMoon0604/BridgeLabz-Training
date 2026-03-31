package wordFrequencyCounter;

import java.util.*;

public class WordCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> wordCountMap = Arrays.stream(words).collect(java.util.stream.Collectors.toMap(word -> word,word -> 1,Integer::sum));
        return wordCountMap;
    }
}
