class Book {
    public String isbn;
    protected String title;
    private String author;
    
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void displayBookInfo() {
        System.out.printf("ISBN: %s, Title: %s, Author: %s%n", 
                         isbn, title, author);
    }
}

class EBook extends Book {
    private String fileFormat;
    
    EBook(String isbn, String title, String author, String fileFormat) {
        super(isbn, title, author);
        this.fileFormat = fileFormat;
    }
    
    public void updateTitle(String newTitle) {
        this.title = newTitle;
    }
    
    public void displayEBookInfo() {
        System.out.printf("E-CheckBook - ISBN: %s, Title: %s, Author: %s, Format: %s%n",
                         isbn, title, getAuthor(), fileFormat);
    }
    public static void main(String[] args) {
        System.out.println("=== Regular CheckBook ===");
        Book book1 = new Book("978-0-7475-3269-9", "Harry Potter", "J.K. Rowling");
        book1.displayBookInfo();
        
        System.out.println("\nAuthor update:");
        book1.setAuthor("Joanne Rowling");
        System.out.println("Author: " + book1.getAuthor());
        
        System.out.println("\n=== E-CheckBook ===");
        EBook ebook = new EBook("978-1-60309-399-7", "Calvin & Hobbes", "Bill Watterson", "EPUB");
        ebook.displayEBookInfo();
        
        System.out.println("\nTitle update from subclass:");
        ebook.updateTitle("Complete Calvin & Hobbes Collection");
        ebook.displayEBookInfo();
    }
}



