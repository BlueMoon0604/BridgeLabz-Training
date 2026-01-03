class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println("Vehicle Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType);
    }
}class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo() {
        System.out.println("Car Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType + ", Seats = " + seatCapacity);
    }
}
class Truck extends Vehicle {
    int loadCapacity; 
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        System.out.println("Truck Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType + ", Load Capacity = " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;
    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }
    void displayInfo() {
        System.out.println("Motorcycle Details: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType + ", Sidecar = " + (hasSidecar ? "Yes" : "No"));
    }
}
public class Vehiclemanagement {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(150, "Petrol", false);
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}

