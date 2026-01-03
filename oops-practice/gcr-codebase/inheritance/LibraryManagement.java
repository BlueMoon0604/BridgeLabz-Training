class Book {
    protected String title;
    protected int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}
class Author extends Book {
    protected String name;
    protected String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    public void displayInfo() {
        System.out.println("Author: " + name + " - Bio: " + bio);
        System.out.println("  Book: \"" + title + "\" (" + publicationYear + ")");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Court of thorns", 2024);
        Book authorBook = new Author("Whale in the sea", 2025, "darwin", "fantasy");
        book1.displayInfo();  
        authorBook.displayInfo(); 
    }
}
