package futureLogistic;

class TimberTransport extends GoodsTransport {
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;
    
    public TimberTransport(String transportId, String transportDate, int transportRating,
                          float timberLength, float timberRadius, String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }
    
    public float getTimberLength() { return timberLength; }
    public void setTimberLength(float timberLength) { this.timberLength = timberLength; }
    
    public float getTimberRadius() { return timberRadius; }
    public void setTimberRadius(float timberRadius) { this.timberRadius = timberRadius; }
    
    public String getTimberType() { return timberType; }
    public void setTimberType(String timberType) { this.timberType = timberType; }
    
    public float getTimberPrice() { return timberPrice; }
    public void setTimberPrice(float timberPrice) { this.timberPrice = timberPrice; }
    @Override
    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;
        if (area < 250) {
            return "Truck";
        } else if (area >= 250 && area <= 400) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }
    @Override
    public float calculateTotalCharge() {
        float volume = 3.147f * timberRadius * timberRadius * timberLength;
        float typeMultiplier = timberType.toLowerCase().contains("premium") ? 0.25f : 0.15f;
        float price = volume * timberPrice * typeMultiplier;
        float tax = price * 0.3f;
        float vehiclePrice = getVehiclePrice(vehicleSelection());
        float discountPercentage = getDiscountPercentage();
        float discount = price * discountPercentage / 100;
        return (price + vehiclePrice + tax) - discount;
    }
    private float getVehiclePrice(String vehicleType) {
        vehicleType = vehicleType.toLowerCase();
        if (vehicleType.contains("truck")) return 1000;
        else if (vehicleType.contains("lorry")) return 1700;
        else return 3000;
    }
    private float getDiscountPercentage() {
        if (transportRating == 5) return 20;
        else if (transportRating == 3 || transportRating == 4) return 10;
        else return 0;
    }
}
