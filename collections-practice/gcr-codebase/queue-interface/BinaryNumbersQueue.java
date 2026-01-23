package collections;

import java.util.*;

public class BinaryNumbersQueue {
    public static List<String> generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();
        
        queue.add("45");
        while (result.size() < n) {
            String current = queue.remove();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        List<String> binaryNumbers = generateBinaryNumbers(n);
        System.out.println(binaryNumbers);
    }
}

