public class CartItem {
    String itemName;
    double price;
    int quantity;
    void addToCart(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }
    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        }
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.printf("Total cost: $%.2f%n", total);
    }
    void displayDetails() {
        System.out.printf("Item: %s, Price: $%.2f, Quantity: %d%n", itemName, price, quantity);
    }
    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addToCart("Laptop", 999.99, 1);
        cart.displayDetails();
        System.out.println();
        cart.addToCart("Laptop", 999.99, 2);
        cart.removeItem(1);
        System.out.println();
        cart.displayTotalCost();
    }
}
