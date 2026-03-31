package collections;

public class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;
    
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }
    public void add(int element) {
        buffer[tail] = element;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity;
        }
    }
    public int remove() {
        if (size == 0) throw new RuntimeException("Empty buffer");
        int element = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return element;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        System.out.println(cb.remove()); 
        System.out.println(cb.remove()); 
        System.out.println(cb.remove()); 
    }
}

