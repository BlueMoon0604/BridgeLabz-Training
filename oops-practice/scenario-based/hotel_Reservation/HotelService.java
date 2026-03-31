package hotel_Reservation;

import java.util.ArrayList;
import java.util.List;
public class HotelService {
    private List<Room> rooms = new ArrayList<>();
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void displayRooms() {
        for (Room r : rooms) {
            System.out.println(r.getRoomNumber() + " | " + r.getRoomType() + " Available: " + r.isAvailable());
        }
    }
    public Reservation bookRoom(int roomNumber, Guest guest, int days)
            throws RoomNotAvailableException {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (!room.isAvailable()) {
                    throw new RoomNotAvailableException("Room is already booked");
                }
                return new Reservation(room, guest, days);
            }
        }
        throw new RoomNotAvailableException("Room not found");
    }
}
