public class Book {
    private static String libraryName = "Egmore Library";
    private final String isbn;
    private String title;
    private String author;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book ");
        }
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public static void main(String[] args) {
    	Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        displayLibraryName();
        book1.displayBookDetails();
        Book book2 = new Book("Letting Go ", "Philip Roth", "978-0132350884");
        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
}
