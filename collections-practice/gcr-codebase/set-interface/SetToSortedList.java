package collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetToSortedList {
    public static List<Integer> hashSetToSortedList1(Set<Integer> hashSet) {
        return new ArrayList<>(new TreeSet<>(hashSet));
    }
    public static List<Integer> hashSetToSortedList2(Set<Integer> hashSet) {
        List<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        return list;
    }
    public static List<Integer> hashSetToSortedList3(Set<Integer> hashSet) {
        return hashSet.stream()
                      .sorted()
                      .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        
        System.out.println("Input HashSet: " + hashSet);
        System.out.println("Method 1 (TreeSet): " + hashSetToSortedList1(hashSet));
        System.out.println("Method 2 (sort): " + hashSetToSortedList2(hashSet));
        System.out.println("Method 3 (Stream): " + hashSetToSortedList3(hashSet));
    }
}

