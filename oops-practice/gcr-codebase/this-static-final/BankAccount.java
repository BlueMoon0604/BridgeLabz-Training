public class BankAccount {
    private static String libraryName = "Central Library";
    private static int totalBooks = 0;
    private final String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private boolean isAvailable;
    
    public BankAccount(String bookTitle, String bookAuthor, String bookISBN) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.isAvailable = true;
        totalBooks++;
    }
    public static void getTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
    public void displayBookDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Book Title: " + bookTitle);
            System.out.println("Book Author: " + bookAuthor);
            System.out.println("Book ISBN: " + bookISBN);
            System.out.println("Availability: " + (isAvailable ? "Available" : "Issued"));
        } else {
            System.out.println("Invalid book instance.");
        }
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }
    public static void main(String[] args) {
        BankAccount book1 = new BankAccount("Effective Java", "Joshua Bloch", "978-0134685991");
        BankAccount book2 = new BankAccount("Clean Code", "Robert C. Martin", "978-0132350884");
        System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();
        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
        BankAccount.getTotalBooks();
        
        System.out.println("\nPerforming library operations on Book 1:");
        book1.issueBook();
        book1.returnBook();
        book1.displayBookDetails();
        System.out.println("\nBook 2 operations:");
        book2.issueBook();
        book2.displayBookDetails();
        book2.issueBook();
    }
}
