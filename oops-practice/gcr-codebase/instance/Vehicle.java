public class Vehicle {
    String ownerName;
    String vehicleType;
    
    static double registrationFee = 5000.0;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.printf("%s owns %s. Registration Fee: ₹%.2f%n", 
                         ownerName, vehicleType, registrationFee);
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Rohan Sharma", "Sedan");
        Vehicle bike = new Vehicle("Priya Patel", "Sports Bike");
        Vehicle truck = new Vehicle("Amit Singh", "Heavy Truck");
        
        System.out.println("Before updating registration fee:");
        car.displayVehicleDetails();
        bike.displayVehicleDetails();
        System.out.println();
        Vehicle.updateRegistrationFee(7500.0);
        System.out.println("After updating registration fee:");
        car.displayVehicleDetails();
        truck.displayVehicleDetails();
        System.out.println();
        bike.displayVehicleDetails();
    }
}
 