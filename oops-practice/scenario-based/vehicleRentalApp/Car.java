package vehicleRentalApp;

public class Car extends Vehicle {
    public Car(int id, String brand, double ratePerDay) {
        super(id, brand, ratePerDay);
    }
    public void displayInfo() {
        System.out.println("Vehicle Type : Car");
        super.displayInfo();
    }
}
