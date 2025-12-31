
public class BookDetails {
	String title;
	String author;
	double price ;
	
	void displayDetails() {
		System.out.println("Book's Title is : " + title);
		System.out.println("Book's Author is : " + author);
		System.out.println("Book's Price is : " + price);
	}
	public static void main(String[] args) {
		BookDetails book1 = new BookDetails();
		book1.title = "2States";
		book1.author = "Chetan Bhagat";
		book1.price = 500.0;
		book1.displayDetails();
		BookDetails book2 = new BookDetails();
		book1.title = "Wings Of Fire";
		book1.author = "Abdul kalam A.P.J";
		book1.price = 500.0;
		book2.displayDetails();
		
	}

}
