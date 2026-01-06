interface Taxable {
    double calculateTax();
}
abstract class Product {
    String productId, name;
    double price;
    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    abstract double calculateDiscount();
    double getFinalPrice() {
        return price + (this instanceof Taxable ? ((Taxable)this).calculateTax() : 0) - calculateDiscount();
    }
    void display() {
        System.out.println(productId + ": " + name + " - Final: $" + getFinalPrice());
    }
}
class Electronics extends Product implements Taxable {
    Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    double calculateDiscount() {
        return price * 0.1;
    }
    public double calculateTax() {
        return price * 0.08;
    }
}
class Clothing extends Product implements Taxable {
    Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }
    double calculateDiscount() {
        return price * 0.05;
    }
    public double calculateTax() {
        return price * 0.05;
    }
}
class Groceries extends Product {
    Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }
    double calculateDiscount() {
        return 0;
    }
}
public class EcommercePlatform {
    public static void main(String[] args) {
        Product[] products = {new Electronics("E1", "iPhone", 1000), new Clothing("C1", "Shirt", 50),new Groceries("G1", "Milk", 3)};
        for (Product p : products) {
            p.display();
        }
    }
}
