import java.time.LocalDate;
class Order {
    protected String orderId;
    protected LocalDate orderDate;
    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId + ", Date: " + orderDate + ", Status: " + getOrderStatus());
    }
}
class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }
}
class DeliveredOrder extends ShippedOrder {
    protected LocalDate deliveryDate;
    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}
public class OnlineRetailStore {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("ORD001", LocalDate.of(2025, 10, 4)), new ShippedOrder("ORD002", LocalDate.of(2025, 8, 23), "TRK123"),
            new DeliveredOrder("ORD003", LocalDate.of(2025, 12, 3), "TRK456", LocalDate.of(2025, 12, 8))
        };
        for (Order order : orders) {
            order.displayInfo();  
        }
    }
}
