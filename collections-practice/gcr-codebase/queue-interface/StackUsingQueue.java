package collections;

import java.util.*;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }
    public int pop() {
        return q1.remove();
    }
    public int top() {
        return q1.peek();
    }
    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(45);
        stack.push(23);
        stack.push(12);
        System.out.println(stack.pop());  
        System.out.println(stack.top());  
    }
}

