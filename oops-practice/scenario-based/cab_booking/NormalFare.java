package cab_booking;

public class NormalFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

