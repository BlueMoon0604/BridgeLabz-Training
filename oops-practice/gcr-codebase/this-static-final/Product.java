public class Product {
    private static double discount = 10.0;
    
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    
    public Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        }
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            double discountedPrice = price * (1 - discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Discount: %.1f%%%n", discount);
            System.out.printf("Price after Discount: $%.1f%n%n", discountedPrice);
        } else {
            System.out.println("Invalid product instance.");
        }
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", "P001", 1200.0, 5);
        Product smartphone = new Product("Smartphone", "P002", 800.0, 10);
        
        laptop.displayProductDetails();
        smartphone.displayProductDetails();
    }
}
