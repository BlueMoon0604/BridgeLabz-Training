package book_shelf;

public class LibraryManager {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("The Wheel of Time", "Robert Jordan");
        Book b2 = new Book("The Fourth Rings", "Sarah J Mas");
        Book b3 = new Book("The Lord of Rings ", "J.R.R. Tolkien");
        Book b4 = new Book("The Hobbit", "J.R.R. Tolkien"); 

        shelf.addBook("Fantasy", b1);
        shelf.addBook("Fanatsy", b2);
        shelf.addBook("Fantasy", b3);
        shelf.addBook("Fantasy", b4); 

        shelf.displayCatalog();

        shelf.borrowBook("Fanatsy", b2);
        shelf.borrowBook("Fantasy", b3);

        shelf.displayCatalog();
    }
}
