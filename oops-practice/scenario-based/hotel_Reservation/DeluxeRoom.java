package hotel_Reservation;

public class DeluxeRoom extends Room {

    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 6700);
    }
    public String getRoomType() {
        return "Deluxe Room";
    }
}
