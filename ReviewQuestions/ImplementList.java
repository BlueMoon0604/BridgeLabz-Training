package default_package;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ImplementList {
    static Node head;
    
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    
    public void addAtPosition(int position, int data) {
        if (position <= 0) return;
        if (position == 1) {
            addAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node prev = head;
        for (int i = 0; i < position - 1 && prev != null; i++) {
            prev = prev.next;
        }
        if (prev == null) return;
        newNode.next = prev.next;
        prev.next = newNode;
    }
    
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        prev.next = null;
    }
    
    public void deleteByValue(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node prev = head;
        while (prev.next != null && prev.next.data != key) {
            prev = prev.next;
        }
        if (prev.next == null) return;
        prev.next = prev.next.next;
    }
    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" => ");
            }
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ImplementList l1 = new ImplementList();
        l1.addAtBeginning(45);
        l1.addAtEnd(23);
        l1.addAtPosition(2, 34);
        l1.addAtPosition(3, 98);
        l1.addAtPosition(4, 56);
        l1.display();
        
        l1.deleteFromBeginning();
        l1.deleteFromEnd();
        l1.deleteByValue(98); 
        System.out.println("Resulted list");
        l1.display();
    }
}
