package vehicleRentalApp;

public class Bike extends Vehicle {
    public Bike(int id, String brand, double ratePerDay) {
        super(id, brand, ratePerDay);
    }
    public void displayInfo() {
        System.out.println("Vehicle Type is Bike");
        super.displayInfo();
    }
}
