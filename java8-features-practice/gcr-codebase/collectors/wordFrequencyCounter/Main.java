package wordFrequencyCounter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Technology is evolving rapidly and technology is shaping the way people work learn and communicate. Modern software systems rely on clean code and smart design. When developers write clean code the software becomes easier to maintain and improve over time.";
        Map<String, Integer> result = WordCounter.countWordFrequency(paragraph);
        result.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
