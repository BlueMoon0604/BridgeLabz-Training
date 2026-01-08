class TextStateNode {
    String content;
    TextStateNode prev;
    TextStateNode next;

    TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
class TextEditor {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_HISTORY = 10;
    public void addState(String text) {
        TextStateNode newNode = new TextStateNode(text);
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed");
        displayCurrentState();
    }
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }
        current = current.next;
        System.out.println("Redo performed");
        displayCurrentState();
    }
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
            return;
        }
        System.out.println("Current Text " + current.content);
    }
}
public class UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! This");
        editor.addState("Hello World! This is");
        editor.addState("Hello World! This is Java");
        editor.displayCurrentState();

        System.out.println("Undo");
        editor.undo();

        System.out.println("Undo");
        editor.undo();

        System.out.println("Redo");
        editor.redo();

        System.out.println("Add New Text (after undo)");
        editor.addState("Hello World! This is Java Programming");
        editor.displayCurrentState();

        System.out.println("Redo Attempt");
        editor.redo();
    }
}
