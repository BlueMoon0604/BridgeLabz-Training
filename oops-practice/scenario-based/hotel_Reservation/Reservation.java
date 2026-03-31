package hotel_Reservation;

public class Reservation {
    private Room room;
    private Guest guest;
    private int days;
    private boolean checkedIn;
    public Reservation(Room room, Guest guest, int days) {
        this.room = room;
        this.guest = guest;
        this.days = days;
    }
    public void checkIn() {
        checkedIn = true;
        room.bookRoom();
        System.out.println(guest.getName() + " checked into room " + room.getRoomNumber());
    }
    public double checkOut(PricingStrategy pricingStrategy) {
        checkedIn = false;
        room.checkoutRoom();
        double bill = pricingStrategy.calculatePrice(room, days);
        System.out.println("Checked out. Total bill: Rs. " + bill);
        return bill;
    }
}
