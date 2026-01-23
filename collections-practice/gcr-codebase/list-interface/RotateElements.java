package collections;

import java.util.*;

public class RotateElements {
    
    public static <T> void rotateArrayList(ArrayList<T> list, int k) {
        int n = list.size();
        if (n == 0) return;
        
        k = k % n;
        if (k == 0) return;
        
        reverse(list, 0, n - 1);
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
    }
    private static <T> void reverse(ArrayList<T> list, int start, int end) {
        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static <T> List<T> rotateNewList(List<T> original, int k) {
        int n = original.size();
        if (n == 0) return new ArrayList<>();
        k = k % n;
        
        List<T> rotated = new ArrayList<>();
        for (int i = k; i < n; i++) {
            rotated.add(original.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(original.get(i));
        }
        return rotated;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 70, 30, 60, 10));
        System.out.println("Original: " + list);
        
        RotateElements.rotateArrayList(list, 2);
        System.out.println("Rotated (in-place): " + list);
        
        List<Integer> rotatedNew = RotateElements.rotateNewList(
            Arrays.asList(10, 20, 30, 40, 50), 2);
        System.out.println("Rotated (new list): " + rotatedNew);
    }
}

