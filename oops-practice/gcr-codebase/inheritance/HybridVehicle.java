interface Refuelable {
    void refuel();
}
class Transport {
    protected int maxSpeed;
    protected String model;
    public Transport(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public void displayInfo() {
        System.out.println("Vehicle: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}
class ElectricVehicle extends Transport {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void charge() {
        System.out.println(model + " is charging...");
    }
}
class PetrolVehicle extends Transport implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println(model + " is refueling petrol...");
    }
}
public class HybridVehicle {
    public static void main(String[] args) {
        Transport[] vehicles = {new ElectricVehicle(250, "Tesla Model 2 "), new PetrolVehicle(300, "Hyundai i10")};
        for (Transport v : vehicles) {
            v.displayInfo();
        }
        ((ElectricVehicle)vehicles[0]).charge();
        ((PetrolVehicle)vehicles[1]).refuel();
    }
}
