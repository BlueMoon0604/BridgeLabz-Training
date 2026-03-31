package event_Manager;

public class Main {
    public static void main(String[] args) {
        Ticket[] tickets = {
            new Ticket(1, 2500),
            new Ticket(2, 1200),
            new Ticket(3, 4500),
            new Ticket(4, 800),
            new Ticket(5, 3000),
            new Ticket(6, 1500)
        };
        TicketSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Top Cheapest Tickets ");
        for (int i = 0; i < Math.min(3, tickets.length); i++) {
            System.out.println(tickets[i]);
        }
        System.out.println("Top Expensive Tickets ");
        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
            System.out.println(tickets[i]);
        }
    }
}
