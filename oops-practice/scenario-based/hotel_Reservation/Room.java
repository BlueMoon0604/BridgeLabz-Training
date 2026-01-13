package hotel_Reservation;

public abstract class Room {
    protected int roomNumber;
    protected double basePrice;
    protected boolean available = true;
    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public boolean isAvailable() {
        return available;
    }
    public void bookRoom() {
        available = false;
    }
    public void checkoutRoom() {
        available = true;
    }
    public abstract String getRoomType();
}
