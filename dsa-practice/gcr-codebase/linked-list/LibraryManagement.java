class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLibrary {
    private BookNode head;
    private BookNode tail;

    public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addAtEnd(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void addAtPosition(int position, int id, String title, String author, String genre, boolean status) {
        if (position == 1) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, status);
            return;
        }
        BookNode newNode = new BookNode(id, title, author, genre, status);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                    else
                        tail = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book is removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book is not found");
    }
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Book is  not found");
    }
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Book is not found");
    }
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability is  updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book is not found");
    }
    public void displayForward() {
        if (head == null) {
            System.out.println("No books are available");
            return;
        }
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books are  available");
            return;
        }
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }
    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books in Library: " + count);
    }

    private void displayBook(BookNode book) {
        System.out.println("Book ID: " + book.bookId + ", Title: " + book.title  + ", Author: " + book.author + ", Genre: " + book.genre + ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        DoublyLibrary list = new DoublyLibrary();
        list.addAtEnd(1, "The Court of thorns", "Sarah J Mas ", "Fantasy", true);
        list.addAtBeginning(2, "The Court Of Wings And Fire", "Sarah J Mas ", "Fantasy", true);
        list.addAtEnd(3, "The White Tiger", "Aravind Adiga", "Motivation", false);
        list.addAtPosition(2, 4, "Atomic Habits", "Jmaes Clear", "Self-Help", true);

        System.out.println("All Books (Forward):");
        list.displayForward();

        System.out.println("All Books (Reverse):");
        list.displayReverse();

        System.out.println("Search by Author:");
        list.searchByAuthor("Sarah J Mas");

        System.out.println("Update Availability:");
        list.updateAvailability(3, true);

        System.out.println("Remove book by id 2 ");
        list.removeById(2);

        System.out.println("Final Library ");
        list.displayForward();

        System.out.println();
        list.countBooks();
    }
}
