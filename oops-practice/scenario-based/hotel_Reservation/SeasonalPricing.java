package hotel_Reservation;

public class SeasonalPricing implements PricingStrategy {
    private double seasonMultiplier;
    public SeasonalPricing(double seasonMultiplier) {
        this.seasonMultiplier = seasonMultiplier;
    }
    public double calculatePrice(Room room, int days) {
        return room.basePrice * days * seasonMultiplier;
    }
}
