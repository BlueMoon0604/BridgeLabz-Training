
public class CheckBook {
	String title;
	String author;
	double price;
	CheckBook() {
        this.title = "Unknown";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    CheckBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
        System.out.println();
    }
    
    public static void main(String[] args) {
        CheckBook book1 = new CheckBook();
        book1.displayDetails();
        CheckBook book2 = new CheckBook("2States", "Chetan Bhagat", 500.0);
        book2.displayDetails();
        CheckBook book3 = new CheckBook("Court of Thorns", "Sarah J Mamas ", 350.0);
        book3.displayDetails();
    }
}
	


