package collections;

import java.util.*;

public class ReverseQueue {
    
    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) {
            return;
        }
        T front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(98);
        queue.add(120);
        queue.add(45);
        
        System.out.println("Before: " + queue);
        reverseQueue(queue);
        System.out.println("After: " + queue);
    }
}

