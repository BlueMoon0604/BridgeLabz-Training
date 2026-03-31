package futureLogistic;

class BrickTransport extends GoodsTransport {
    private float brickSize;
    private int brickQuantity;
    private float brickPrice;
    
    public BrickTransport(String transportId, String transportDate, int transportRating,
                         float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }
    public float getBrickSize() { return brickSize; }
    public void setBrickSize(float brickSize) { this.brickSize = brickSize; }
    
    public int getBrickQuantity() { return brickQuantity; }
    public void setBrickQuantity(int brickQuantity) { this.brickQuantity = brickQuantity; }
    
    public float getBrickPrice() { return brickPrice; }
    public void setBrickPrice(float brickPrice) { this.brickPrice = brickPrice; }
    
    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        } else if (brickQuantity >= 300 && brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }
    @Override
    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
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
