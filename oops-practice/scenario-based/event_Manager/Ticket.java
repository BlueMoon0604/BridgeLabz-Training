package event_Manager;

class Ticket {
    int ticketId;
    double price;
    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }
    public String toString() {
        return "Ticket " + ticketId + " Rs." + price;
    }
}
