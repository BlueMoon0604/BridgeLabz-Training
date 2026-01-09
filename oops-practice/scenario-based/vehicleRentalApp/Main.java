package vehicleRentalApp;

public class Main {

    public static void main(String[] args) {
        RentalSystem service = new RentalSystem();
        Vehicle bike = new Bike(800, "BMW", 29000);
        Vehicle car = new Car(890, "Mercedes", 90000);
        Vehicle truck = new Truck(910, "Lamborgini", 145000);
        service.addVehicle(bike);
        service.addVehicle(car);
        service.addVehicle(truck);
        Customer customer = new Customer(1, "Nova");
        System.out.println("Customer Details:");
        customer.displayCustomer();
        System.out.println("Available Vehicles:");
        service.showVehicles();
        int days = 3;
        System.out.println("Rent for " + days + " days:");
        System.out.println("Bike  : Rs. " + bike.calculateRent(days));
        System.out.println("Car   : Rs." + car.calculateRent(days));
        System.out.println("Truck : Rs. " + truck.calculateRent(days));
    }
}
