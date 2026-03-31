package cab_booking;

public class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15; 
    }
}
