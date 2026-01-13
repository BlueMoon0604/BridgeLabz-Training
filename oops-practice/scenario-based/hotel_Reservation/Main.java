package hotel_Reservation;

public class Main {
    public static void main(String[] args) {
        HotelService hotel = new HotelService();
        hotel.addRoom(new StandardRoom(101));
        hotel.addRoom(new DeluxeRoom(201));
        Guest guest = new Guest(1, "Navya");
        hotel.displayRooms();
        try {
            Reservation reservation =
                    hotel.bookRoom(201, guest, 3);

            reservation.checkIn();
            PricingStrategy pricing =
                    new SeasonalPricing(1.2); 
            reservation.checkOut(pricing);
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
