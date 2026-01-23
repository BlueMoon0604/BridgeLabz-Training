package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseArrayList {
    public static <T> void reverseArrayList(ArrayList<T> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        if (list.isEmpty()) return;
        Node<T> prev = null;
        Node<T> curr = (Node<T>) list.getFirst();
        while (curr != null) {
            Node<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.addAll(java.util.Arrays.asList()); 
    }
    static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1); al.add(2); al.add(3); al.add(4); al.add(5);
        System.out.println("ArrayList before: " + al);
        ReverseArrayList.reverseArrayList(al);
        System.out.println("ArrayList after: " + al);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1); ll.add(2); ll.add(3); ll.add(4); ll.add(5);
        System.out.println("LinkedList before: " + ll);
        
        LinkedList<Integer> reversedLL = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            reversedLL.add(ll.get(i));
        }
        System.out.println("LinkedList after: " + reversedLL);
    }

}
