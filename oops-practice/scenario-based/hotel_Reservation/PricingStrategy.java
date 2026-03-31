package hotel_Reservation;

public interface PricingStrategy {
    double calculatePrice(Room room, int days);
}
