package book_shelf;

import java.util.Objects;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }
    public int hashCode() {
        return Objects.hash(title, author);
    }
    public String toString() {
        return title + " by " + author;
    }
}
