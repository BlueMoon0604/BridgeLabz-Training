package traffic_manager;

class WaitingQueue {
    private String[] queue;
    private int front, rear, size;
    
    public WaitingQueue(int capacity) {
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isFull() {
        return size == queue.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void enqueue(String vehicle) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = vehicle;
        size++;
        System.out.println(vehicle + " added to waiting queue.");
    }
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return vehicle;
    }
}
