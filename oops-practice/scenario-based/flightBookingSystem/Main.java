package flightBookingSystem;

public class Main {
    public static void main(String[] args) {
        Flight[] flights = {
            new Flight(101, "Melbourne", "California", 2),
            new Flight(102, "Dublin", "Tokyo", 3),
            new Flight(103, "Seoul", "Bangkok", 1)
        };
        FlightService service = new FlightService(flights);
        System.out.println("Searching flights (Dublin -> Tokyo)");
        service.searchFlight("Dublin", "Tokyo"); 
        System.out.println(" Booking a flight");
        service.bookFlight(101, "Samria");
        System.out.println("Booking Details:");
        service.showBookings();
    }
}
