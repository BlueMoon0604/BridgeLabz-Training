public class LibrarySystem {
    String title;
    String author;
    double price;
    boolean availability;

    LibrarySystem() {
        this.title = "Unknown CheckBook";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.availability = true;
    }
    LibrarySystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }
    boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("CheckBook '" + title + "' borrowed successfully!");
            return true;
        } else {
            System.out.println("Sorry, '" + title + "' is not available!");
            return false;
        }
    }
    void returnBook() {
        availability = true;
        System.out.println("CheckBook '" + title + "' returned successfully!");
    }
    void displayDetails() {
        System.out.printf("Title: %s, Author: %s, Price: ₹%.2f, Available: %s%n", 
                         title, author, price, availability ? "Yes" : "No");
    }
    public static void main(String[] args) {      
        LibrarySystem book1 = new LibrarySystem("2 States", "Chetan Bhagat", 299.0);
        LibrarySystem book2 = new LibrarySystem("Wings of Fire", "Abdul Kalam", 500.0);
        book1.displayDetails();
        book2.displayDetails();
        System.out.println();
        System.out.println("Borrowing process:");
        book1.borrowBook();
        book2.borrowBook();
        System.out.println();
        System.out.println("After borrowing:");
        book1.displayDetails();
        book2.displayDetails();
    }
}
