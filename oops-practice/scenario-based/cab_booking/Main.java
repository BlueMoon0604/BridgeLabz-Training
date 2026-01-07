package cab_booking;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Navya");
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(101, "Colin"));
        drivers.add(new Driver(102, "David"));
        RideService service = new RideService(drivers);
        FareCalculator fare = new PeakFare();
        try {
            Ride ride = service.bookRide(user, 34, fare);
            ride.showRideDetails();
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ride History:");
        service.showRideHistory();
    }
}
