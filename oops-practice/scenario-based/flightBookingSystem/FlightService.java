package flightBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    private Flight[] flights;        
    private List<Booking> bookings;  
    public FlightService(Flight[] flights) {
        this.flights = flights;
        this.bookings = new ArrayList<>();
    }
    public void searchFlight(String from, String to) {
        boolean found = false;

        for (Flight f : flights) {
            if (f.from.equalsIgnoreCase(from) && f.to.equalsIgnoreCase(to)) {
                f.displayFlight();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching flights found");
        }
    }
    public void bookFlight(int flightId, String passengerName) {
        for (Flight f : flights) {
            if (f.flightId == flightId && f.seats > 0) {
                f.seats--;
                bookings.add(new Booking(passengerName, f));
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Flight not available or seats full.");
    }
    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        for (Booking b : bookings) {
            b.displayBooking();
        }
    }
}

