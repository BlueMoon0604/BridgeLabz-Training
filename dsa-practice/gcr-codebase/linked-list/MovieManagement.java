class MovieNode{
	String title;
	String director;
	int yearOfRelease;
	double rating;
	MovieNode next;
	MovieNode prev;
	
	MovieNode(String title, String director, int yearOfRelease, double rating){
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
		this.next = null;
		this.prev = null;
	}
}
class DoublyMovieList{
	private MovieNode head;
	private MovieNode tail;
	
	public void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
		MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
		if(head == null) {
			head=tail=newNode;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	public void addAtEnd(String title, String director, int yearOfRelease, double rating) {
		MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
		if(head == null) {
			head=tail=newNode;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		
	}
	public void addAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
		if(position == 1) {
			addAtBeginning(title, director, yearOfRelease, rating);
			return;
		}
		MovieNode temp = head;
		for(int i = 1; i < position - 1 && temp != null ; i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null) {
			addAtEnd(title, director, yearOfRelease, rating);
			return;
		}
		MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;
	}
	public void removeByTitle(String title) {
		if(head==null) {
			System.out.println("No movie found");
			return;
		}
		MovieNode temp = head;
		while(temp != null) {
			if(temp.title.equalsIgnoreCase(title)) {
				if(temp == head) {
					head = head.next;
					if(head != null) {
						head.prev = null;
					}
				}else if(temp == tail) {
					tail = tail.prev;
					tail.next = null;
				}else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}
				System.out.println("Movie is removed");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found");
	}
	public void searchByRating(double rating) {
		MovieNode temp = head ;
		boolean found = false;
		while(temp != null) {
			if(temp.rating == rating) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}
		if(!found) {
			System.out.println("No movie found");
		}
	}
	public void updateMovieRating(String title, double rating) {
		MovieNode temp = head;
		while(temp != null) {
			if(temp.title.equalsIgnoreCase(title)) {
				temp.rating = rating;
				System.out.println("Rating updated");
				return;
			}
			temp= temp.next;
		}
		System.out.println("Movie is not found");
	}
	public void displayForward() {
		if(head==null) {
			System.out.println("No Movies available");
			return;
		}
		MovieNode temp = head;
		while(temp != null) {
			displayMovie(temp);
			temp = temp.next;
		}
	}
	public void displayReverse() {
		if(tail == null) {
			System.out.println("No Movies available");
			return;
		}
		MovieNode temp = tail;
		while(temp != null) {
			displayMovie(temp);
			temp = temp.prev;
		}
	}
	private void displayMovie(MovieNode movie) {
		System.out.println("Title "+movie.title+ ", Director "+movie.director+ ", Year Of Release "+movie.yearOfRelease+ ", Rating "+movie.rating);
	}
}
public class MovieManagement {
	public static void main(String[] args) {
		DoublyMovieList list = new DoublyMovieList();
		list.addAtBeginning("The Avengers", "Joss Whedon", 2012, 9.5 );
		list.addAtEnd("Avengers : Endgame", "Russo Brothers", 2019, 9.5 );
		list.addAtPosition(2,"Avengers : Infinity War", "Russo Brothers", 2018, 10.0 );
		
		System.out.println("Removed movie by title");
		list.removeByTitle("The Avengers");
		
		System.out.println("Movie Records in forward");
		list.displayForward();
		
		System.out.println("Movie Records in Reverse");
		list.displayReverse();
		
		System.out.println("Search movie by its rating");
		list.searchByRating(10.0);
		
		System.out.println("Update movie rating based on title ");
		list.updateMovieRating("Avengers : Endgame", 9.8);
		
		System.out.println("Final Records");
		list.displayForward();
	}

}
