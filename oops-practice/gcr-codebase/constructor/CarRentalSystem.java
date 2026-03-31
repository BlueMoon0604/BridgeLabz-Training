public class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;

    CarRentalSystem() {
        this.customerName = "Walk-in Customer";
        this.carModel = "Economy";
        this.rentalDays = 1;
    }
    CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    CarRentalSystem(CarRentalSystem other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }
    double calculateTotalCost() {
        double dailyRate = carModel.equals("Luxury") ? 5000.0 : 
                          carModel.equals("SUV") ? 3500.0 : 2000.0;
        return dailyRate * rentalDays;
    }
    void displayDetails() {
        System.out.printf("%s rented %s for %d days. Total Cost: ₹%.2f%n", 
                         customerName, carModel, rentalDays, calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRentalSystem rental1 = new CarRentalSystem();
        System.out.println("Default Rental:");
        rental1.displayDetails();
        System.out.println();
        
        CarRentalSystem rental2 = new CarRentalSystem("Rohan Sharma", "SUV", 5);
        System.out.println("Parameterized Rental:");
        rental2.displayDetails();
        System.out.println();
       
        CarRentalSystem rental3 = new CarRentalSystem(rental2);
        System.out.println("Copy Constructor Rental:");
        rental3.displayDetails();
        System.out.println();
        rental3.rentalDays = 7;
        System.out.println("After modifying copy:");
        rental2.displayDetails();
        rental3.displayDetails();
    }
}
