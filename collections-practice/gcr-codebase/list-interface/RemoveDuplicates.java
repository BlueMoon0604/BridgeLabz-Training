package collections;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicatesSet(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
    public static <T> List<T> removeDuplicatesInPlace(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        
        for (T item : list) {
            if (seen.add(item)) { 
                result.add(item);
            }
        }
        return result;
    }
    public static <T> List<T> removeDuplicatesStream(List<T> list) {
        return list.stream()
                   .collect(Collectors.collectingAndThen(
                       Collectors.toCollection(LinkedHashSet::new),
                       ArrayList::new));
    }
    
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(6, 12, 5, 9, 0, 5);
        
        System.out.println("Input: " + input);
        System.out.println("Set method: " + removeDuplicatesSet(input));
        System.out.println("Manual method: " + removeDuplicatesInPlace(input));
        System.out.println("Stream method: " + removeDuplicatesStream(input));
    }
}

