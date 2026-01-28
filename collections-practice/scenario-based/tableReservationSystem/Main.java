package tableReservationSystem;

public class Main {
    public static void main(String[] args) {
        TableReseravtionSystem system = new TableReseravtionSystem();
        try {
            system.reserveTable("Alice", 1, "7:00 PM");
            system.reserveTable("Bob", 2, "8:00 PM");
            system.showAvailableTables();
            
            system.reserveTable("Charlie", 1, "9:00 PM");
        } catch (TableAlreadyReservedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        system.cancelReservation(1);
        system.showAvailableTables();
    }
}

