package book_shelf;

import java.util.*;

class BookShelf {

    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    private HashSet<Book> uniqueBooks = new HashSet<>();
    public void addBook(String genre, Book book) {
        if (!uniqueBooks.add(book)) {
            System.out.println("Duplicate book is ignored " + book);
            return;
        }
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Book added: " + book + " [Genre: " + genre + "]");
    }
    public void borrowBook(String genre, Book book) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not available");
            return;
        }
        LinkedList<Book> books = catalog.get(genre);
        if (books.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not available: " + book);
        }

        if (books.isEmpty()) {
            catalog.remove(genre);
        }
    }
    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }
        System.out.println("Library Catalog");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(book);
            }
        }
    }
}

