package default_package;

import java.util.*;

public class CompareDataStructures {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        for (int N : sizes) {
            int target = N - 1;
            // Array
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = i;
            }
            long startArray = System.nanoTime();
            linearSearch(array, target);
            long endArray = System.nanoTime();
            double arrayTime = (endArray - startArray) / 1_000_000.0;

            // HashSet
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < N; i++) {
                hashSet.add(i);
            }
            long startHashSet = System.nanoTime();
            hashSet.contains(target);
            long endHashSet = System.nanoTime();
            double hashSetTime = (endHashSet - startHashSet) / 1000000.0;

            // TreeSet
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                treeSet.add(i);
            }
            long startTreeSet = System.nanoTime();
            treeSet.contains(target);
            long endTreeSet = System.nanoTime();

            double treeSetTime = (endTreeSet - startTreeSet) / 1000000.0;
            System.out.println("Dataset Size , Array , HashSet , TreeSet");
            System.out.printf("%12d , %10.2f , %13.4f , %12.2f%n", N, arrayTime, hashSetTime, treeSetTime);
        }
    }
    // Linear search for array
    static boolean linearSearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target)
                return true;
        }
        return false;
    }
}

