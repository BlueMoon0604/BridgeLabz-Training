
public class HotelBooking {
	String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        this.guestName = "Walk-in Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    double calculateTotalCost() {
        double rate = roomType.equals("Suite") ? 5000.0 : 
                     roomType.equals("Deluxe") ? 3000.0 : 2000.0;
        return rate * nights;
    }
    void displayDetails() {
        System.out.printf("Guest: %s, Room: %s, Nights: %d, Total: ₹%.2f%n", 
                         guestName, roomType, nights, calculateTotalCost());
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayDetails();
        System.out.println();
        
        HotelBooking booking2 = new HotelBooking("shashi prakash", "Suite", 1);
        System.out.println("Parameterized Booking:");
        booking2.displayDetails();
        System.out.println();
        
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copy Constructor Booking:");
    }

}
