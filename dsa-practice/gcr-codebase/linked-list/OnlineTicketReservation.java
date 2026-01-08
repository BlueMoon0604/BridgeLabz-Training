class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationList {
    private TicketNode head;
    public void addTicket(int id, String customer, String movie,int seat, String time) {
        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode temp = head;
        TicketNode prev = null;
        do {
            if (temp.ticketId == id) {
                if (temp == head && temp.next == head) {
                    head = null;
                }
                else if (temp == head) {
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                else {
                    prev.next = temp.next;
                }
                System.out.println("Ticket removed is successfully");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket is not found");
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode temp = head;
        System.out.println("Booked Tickets");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchByCustomer(String name) {
        if (head == null) {
            System.out.println("No tickets is  booked");
            return;
        }
        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for customer " + name);
    }
    public void searchByMovie(String movie) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for movie " + movie);
    }
    public void countTickets() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets Booked: " + count);
    }
    private void displayTicket(TicketNode t) {
        System.out.println("Ticket ID: " + t.ticketId + ", Customer: " + t.customerName + ", Movie: " + t.movieName + ", Seat: " + t.seatNumber + ", Time: " + t.bookingTime);
    }
}
public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketReservationList list = new TicketReservationList();
        list.addTicket(6789, "Nova", "Mongli", 4, "9:30 AM");
        list.addTicket(3400, "Charollte", "Avengers", 11, "10:45 AM");
        list.addTicket(6798, "Aaron", "The Glory", 5, "12:00 AM");

        System.out.println("All Tickets:");
        list.displayTickets();

        System.out.println("Search by Customer");
        list.searchByCustomer("Alice");

        System.out.println("Search by Movie");
        list.searchByMovie("Inception");

        System.out.println("Remove Ticket ID 102");
        list.removeTicket(102);

        System.out.println("Final Ticket List");
        list.displayTickets();

        System.out.println();
        list.countTickets();
    }
}
