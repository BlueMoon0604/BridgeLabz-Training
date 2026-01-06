interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}
abstract class Transport {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;
    Transport(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    abstract double calculateFare(double distance);
    String getVehicleDetails() {
        return vehicleId + " - " + driverName;
    }
}
class Cars extends Transport implements GPS {
    Cars(String vehicleId, String driverName) {
        super(vehicleId, driverName, 15.0);
    }
    double calculateFare(double distance) {
        return distance * ratePerKm;
    }
    public void getCurrentLocation() {
        System.out.println("Car at Main Street");
    }
    public void updateLocation(String location) {
        System.out.println("Car updated to " + location);
    }
}
class Bikes extends Transport implements GPS {
    Bikes(String vehicleId, String driverName) {
        super(vehicleId, driverName, 8.0);
    }
    double calculateFare(double distance) {
        return distance * ratePerKm + 2; // base fee
    }
    public void getCurrentLocation() {
        System.out.println("Bike at Park Road");
    }
    public void updateLocation(String location) {
        System.out.println("Bike updated to " + location);
    }
}
class Auto extends Transport {
    Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10.0);
    }
    double calculateFare(double distance) {
        return distance * ratePerKm + 5; 
    }
}
public class RideHailing {
    public static void main(String[] args) {
        Transport[] vehicles = {new Cars("CAR001", "Alice"), new Bikes("BIKE001", "Bob"),new Auto("AUTO001", "Charlie")};
        double distance = 10.5;
        for (Transport v : vehicles) {
            System.out.println(v.getVehicleDetails() + " - Fare: $" + v.calculateFare(distance));
        }
        ((GPS)vehicles[0]).getCurrentLocation();
    }
}
