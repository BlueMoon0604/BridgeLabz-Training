
public class MovieTicket {
	String movieName;
	String seatNumber;
	double price;
	boolean checkBooking;
	void bookingTicket(String movie, String seat, double ticketPrice) {
        if (checkBooking) {
            System.out.println("House full!!! sorry..... Ticket already booked");
        } else {
            movieName = movie;
            seatNumber = seat;
            price = ticketPrice;
            checkBooking = true;
        }
    }
	void displayDetails() {
		if (!checkBooking) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
	}
	public static void main(String[] args) {
		MovieTicket t1 = new MovieTicket();
		 t1.displayDetails();
	        System.out.println();
	        t1.bookingTicket("Dragon", "A10", 120.0);
	        t1.displayDetails();
	        System.out.println();
	        t1.bookingTicket("Dragon", "A10", 120.0);
	        t1.bookingTicket("Dragon", "A10", 120.0);
	        System.out.println();
	        t1.displayDetails();
	}

}
