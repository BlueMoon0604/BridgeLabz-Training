package online_marketplace;

public class Product<T extends Enum<T>> {
    private String id;
    private String name;
    private double price;
    private T category;
    
    public Product(String id, String name, double price, T category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public T getCategory() {
        return category;
    }
    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + String.format("%.2f", price) + 
               ", Category: " + category;
    }
}
