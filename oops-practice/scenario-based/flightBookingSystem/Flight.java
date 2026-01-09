package flightBookingSystem;

public class Flight {
    int flightId;
    String from;
    String to;
    int seats;
    public Flight(int flightId, String from, String to, int seats) {
        this.flightId = flightId;
        this.from = from;
        this.to = to;
        this.seats = seats;
    }
    public void displayFlight() {
        System.out.println("Flight ID : " + flightId);
        System.out.println("From : " + from);
        System.out.println("To : " + to);
        System.out.println("Seats : " + seats);
    }
}
