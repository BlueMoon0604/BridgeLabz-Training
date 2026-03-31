interface Insurable {
    double calculateInsurance();
}
abstract class Vehicle {
    String vehicleNumber, type;
    double rentalRate;
    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    abstract double calculateRentalCost(int days);
    void display(int days) {
        double rental = calculateRentalCost(days);
        double insurance = (this instanceof Insurable) ? ((Insurable)this).calculateInsurance() : 0;
        System.out.println(vehicleNumber + " (" + type + "): Rental $" + rental + ", Insurance $" + insurance);
    }
}
class Car extends Vehicle implements Insurable {
    Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }
    public double calculateInsurance() {
        return 50;
    }
}
class Bike extends Vehicle implements Insurable {
    Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }
    double calculateRentalCost(int days) {
        return rentalRate * days * 0.7;
    }
    public double calculateInsurance() {
        return 20;
    }
}
class Truck extends Vehicle {
    Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }
    double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }
}
public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("CAR001", 100), new Bike("BIKE001", 30),new Truck("TRK001", 200)};
        System.out.println("Rental for 5 days:");
        for (Vehicle v : vehicles) {
            v.display(5);
        }
    }
}
