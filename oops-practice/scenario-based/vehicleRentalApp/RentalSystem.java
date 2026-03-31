package vehicleRentalApp;

import java.util.ArrayList;

public class RentalSystem {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }
    public void showVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo(); 
        }
    }
    public void updateRate(int vehicleId, double newRate) {
        for (Vehicle v : vehicles) {
            if (v.vehicleId == vehicleId) {
                v.ratePerDay = newRate;
            }
        }
    }
    public void removeVehicle(int vehicleId) {
        vehicles.removeIf(v -> v.vehicleId == vehicleId);
    }
}
