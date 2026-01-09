package vehicleRentalApp;

public class Truck extends Vehicle {
    public Truck(int id, String brand, double ratePerDay) {
        super(id, brand, ratePerDay);
    }
    public double calculateRent(int days) {
        return (ratePerDay * days) + 500; // extra charge
    }
    public void displayInfo() {
        System.out.println("Vehicle Type is  Truck");
        super.displayInfo();
    }
}
