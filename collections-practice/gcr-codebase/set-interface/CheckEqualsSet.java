package collections;

import java.util.*;

public class CheckEqualsSet {
    public static boolean areSetsEqual(Set<?> set1, Set<?> set2) {
        return set1.equals(set2);
    }
    public static boolean areSetsEqualManual(Set<?> set1, Set<?> set2) {
        return set1.size() == set2.size() && set1.containsAll(set2);
    }
    public static boolean areSetsEqualHash(Set<?> set1, Set<?> set2) {
        return new HashSet<>(set1).equals(new HashSet<>(set2));
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set1.equals(Set2): " + areSetsEqual(set1, set2));     
        System.out.println("Set1.equals(Set3): " + areSetsEqual(set1, set3));     
        System.out.println("Manual equal: " + areSetsEqualManual(set1, set2));   
    }
}

