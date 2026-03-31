interface Discountable {
    void applyDiscount(double percent);
}
abstract class FoodItem {
    String itemName;
    double price;
    int quantity;
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    abstract double calculateTotalPrice();
    String getItemDetails() {
        return itemName + " x" + quantity + ": $" + calculateTotalPrice();
    }
}
class VegItem extends FoodItem {
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    double calculateTotalPrice() {
        return price * quantity;
    }
}
class NonVegItem extends FoodItem implements Discountable {
    double discount = 0;
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    double calculateTotalPrice() {
        return (price * quantity * 1.2) * (1 - discount / 100); // 20% non-veg charge
    }
    public void applyDiscount(double percent) {
        discount = percent;
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Dal Rice", 8.0, 2),
            new NonVegItem("Chicken Curry", 12.0, 1)
        };
        ((NonVegItem)order[1]).applyDiscount(10);
        System.out.println("Order:");
        double total = 0;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            total += item.calculateTotalPrice();
        }
        System.out.println("Total: $" + total);
    }
}

