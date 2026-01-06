import java.util.ArrayList;
import java.util.List;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Book {
    private String title;
    private String author;
    private String status;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "available";
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String toString() {
        return String.format("%s by %s [%s]", title, author, status);
    }
}
public class LibManagement {
    private List<Book> books = new ArrayList<>();
    private String[] bookTitles = {"Java Programming", "Data Structures", "Algorithms", "Clean Code", "Design Patterns"};
    private String[] bookAuthors = {"John Doe", "Jane Smith", "Alan Turing", "Robert Martin", "Gang of Four"};
    public LibManagement() {
        for (int i = 0; i < bookTitles.length; i++) {
            books.add(new Book(bookTitles[i], bookAuthors[i]));
        }
    }
    public List<Book> searchBooks(String partialTitle) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }
    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getStatus().equals("available")) {
                    book.setStatus("checked out");
                    return;
                } else {
                    throw new BookNotAvailableException(title + " is not available");
                }
            }
        }
        throw new BookNotAvailableException("Book not found: " + title);
    }
    public void displayAllBooks() {
        System.out.println("=== Library Inventory ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        LibManagement library = new LibManagement();
        library.displayAllBooks();
        try {
            List<Book> results = library.searchBooks("java");
            System.out.println("\nSearch 'java':");
            for (Book b : results) {
                System.out.println(b);
            }
            library.checkoutBook("Java Programming");
            library.checkoutBook("Java Programming");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nAfter checkout:");
        library.displayAllBooks();
    }
}
