package collections;

import java.util.*;

public class FindSubsets {
    public static <T> boolean isSubset(Set<T> subset, Set<T> superset) {
        return superset.containsAll(subset);
    }
    public static <T> boolean isSubsetManual(Set<T> subset, Set<T> superset) {
        for (T element : subset) {
            if (!superset.contains(element)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));      
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Is Set1 subset of Set2? " + isSubset(set1, set2));     
        

        Set<Integer> set3 = new HashSet<>(Arrays.asList(2, 5));
        System.out.println("Set3: " + set3);
        System.out.println("Is Set3 subset of Set2? " + isSubset(set3, set2));    
    }
}

