package vehicleRentalApp;

public class Vehicle implements IRentable {
    protected int vehicleId;
    protected String brand;
    protected double ratePerDay;
    public Vehicle(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }
    public double calculateRent(int days) {
        return ratePerDay * days;
    }
    public void displayInfo() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand      : " + brand);
        System.out.println("Rate/Day   : ₹" + ratePerDay);
    }
}
