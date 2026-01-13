package real_BookArrangement;

public class Main {
    public static void main(String[] args) {

        Book[] shelf = new Book[10];
        int count = 0;
        shelf[count++] = new Book("Atomic Habits", "James Clear");
        SmartShelf.insertionSort(shelf, count);
        SmartShelf.display(shelf, count);

        shelf[count++] = new Book("Court of Throns", "Sarah");
        SmartShelf.insertionSort(shelf, count);
        SmartShelf.display(shelf, count);

        shelf[count++] = new Book("Data Structures", "Mark");
        SmartShelf.insertionSort(shelf, count);
        SmartShelf.display(shelf, count);

        shelf[count++] = new Book("Court of wings and fire ", "Sarah");
        SmartShelf.insertionSort(shelf, count);
        SmartShelf.display(shelf, count);
    }
}
