package default_package;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> enqueue = new Stack<>();
	Stack<Integer> dequeue = new Stack<>();
	
	void enqueueOp(int value) {
		enqueue.push(value);
	}
	int dequeueOp() {
		if(dequeue.isEmpty()) {
			while(!enqueue.isEmpty()) {
				dequeue.push(enqueue.pop());
			}
		}
		return dequeue.pop();
	}
	int front() {
		if(dequeue.isEmpty()) {
			while(!enqueue.isEmpty()) {
				dequeue.push(enqueue.pop());
			}
		}
		return dequeue.peek();
	}
	boolean isEmpty() {
		return enqueue.isEmpty() && dequeue.isEmpty();
	}
	public static void main(String[] args) {
        QueueUsingStack queue1 = new QueueUsingStack();
        
        queue1.enqueueOp(45);
        queue1.enqueueOp(60);
        queue1.enqueueOp(100);
        queue1.enqueueOp(38);
        queue1.enqueueOp(56);
        System.out.println("Front " + queue1.front());  
        System.out.println("Dequeue  " + queue1.dequeueOp()); 
        System.out.println("Front now " + queue1.front()); 
        System.out.println("Empty? " + queue1.isEmpty());
    }
}
