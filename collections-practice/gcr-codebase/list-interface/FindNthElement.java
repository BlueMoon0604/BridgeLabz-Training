package collections;

class Node<T> {
    T data;
    Node<T> next;
    
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
public class FindNthElement {
    public static <T> T findNthFromEnd(Node<T> head, int n) {
        if (head == null) {
        	return null;
        }
        Node<T> fast = head;
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; 
            }
            fast = fast.next;
        }
        Node<T> slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow.data;
    }
    public static void printList(Node<String> head) {
        Node<String> current = head;
        System.out.print("List: [");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Node<String> head = new Node<>("A");
        head.next = new Node<>("F");
        head.next.next = new Node<>("E");
        head.next.next.next = new Node<>("D");
        head.next.next.next.next = new Node<>("E");
        
        printList(head);
        int n = 2;
        String result = findNthFromEnd(head, n);
        System.out.println("Nth (" + n + ") from end: " + result); 
    }
}
