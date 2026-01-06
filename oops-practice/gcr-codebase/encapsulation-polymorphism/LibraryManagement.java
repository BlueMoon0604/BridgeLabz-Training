interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId, title, author;
    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    abstract int getLoanDuration();
    String getItemDetails() {
        return itemId + ": " + title + " by " + author + " (" + getLoanDuration() + " days)";
    }
    void display() {
        System.out.println(getItemDetails());
    }
}

class Book extends LibraryItem implements Reservable {
    Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 14;
    }
    public void reserveItem() {
        System.out.println("Book reserved");
    }
    public boolean checkAvailability() {
        return true;
    }
}
class Magazine extends LibraryItem implements Reservable {
    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 7;
    }
    public void reserveItem() {
        System.out.println("Magazine reserved");
    }
    public boolean checkAvailability() {
        return true;
    }
}
class DVD extends LibraryItem {
    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 3;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem[] items = {new Book("B001", "Java Guide", "John"),new Magazine("M001", "Tech News", "Editor"),
            new DVD("D001", "Java Tutorial", "Studio")
        };
        for (LibraryItem item : items) {
            item.display();
            if (item instanceof Reservable) {
                ((Reservable)item).reserveItem();
            }
        }
    }
}
