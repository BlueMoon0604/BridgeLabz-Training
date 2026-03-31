package cab_booking;

import java.util.*;

public class RideService {
    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rideHistory = new ArrayList<>();
    public RideService(List<Driver> drivers) {
        this.drivers = drivers;
    }
    public Ride bookRide(User user, double distance, FareCalculator calculator)
            throws NoDriverAvailableException {
        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                driver.assignRide();
                Ride ride = new Ride(user, driver, distance, calculator);
                rideHistory.add(ride);
                return ride;
            }
        }
        throw new NoDriverAvailableException("No drivers available right now!");
    }
    public void showRideHistory() {
        for (Ride ride : rideHistory) {
            ride.showRideDetails();
        }
    }
}
