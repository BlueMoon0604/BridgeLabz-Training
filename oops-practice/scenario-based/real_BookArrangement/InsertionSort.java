package real_BookArrangement;

class SmartShelf {

    public static void insertionSort(Book[] books, int n) {
        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
    public static void display(Book[] books, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
