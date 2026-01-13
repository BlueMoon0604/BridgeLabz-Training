package lib_Management;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void issueBook() {
        this.available = false;
    }
    public void returnBook() {
        this.available = true;
    }
    public String toString() {
        return id + " : " + title + " : " + author + " : Available: " + available;
    }
}
