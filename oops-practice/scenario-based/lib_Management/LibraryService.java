package lib_Management;

import java.util.*;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void displayBooks() {
        books.forEach(System.out::println);
    }
    public void displayMembers() {
        members.forEach(System.out::println);
    }
    public Transaction issueBook(int bookId, Member member)
            throws BookNotAvailableException {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isAvailable()) {
                    throw new BookNotAvailableException("Book already issued");
                }
                book.issueBook();
                return new Transaction(book, member);
            }
        }
        throw new BookNotAvailableException("Book not found");
    }
}
