public class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }
    void displayProductDetails() {
        System.out.printf("Product: %s, Price: ₹%.2f%n", productName, price);
    }
    static void displayTotalProducts() {
        System.out.printf("Total Products Created: %d%n", totalProducts);
    }
    
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 79999.99);
        Product phone = new Product("Smartphone", 27999.99);
        Product book = new Product("Textbook", 999.99);
        
        System.out.println("Product Details:");
        laptop.displayProductDetails();
        phone.displayProductDetails();
        book.displayProductDetails();
        System.out.println();
        
        System.out.println("Class Method Demo:");
        Product.displayTotalProducts();
        new Product("Headphones", 2999.99);
        new Product("Mouse", 999.99);
        System.out.println();
        Product.displayTotalProducts();
    }
}
