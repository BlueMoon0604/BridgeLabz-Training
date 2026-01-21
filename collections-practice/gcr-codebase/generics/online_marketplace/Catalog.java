package online_marketplace;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<Product<?>> products = new ArrayList<>();
    
    public <T extends Enum<T>> void addProduct(Product<T> product) {
        products.add(product);
    }
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            double discount = product.getPrice() * (percentage / 100.0);
            product.setPrice(product.getPrice() - discount);
            System.out.println("Discount " + percentage + "% applied to " + product.getDetails());
        }
    }
    public void displayAll() {
        for (Product<?> p : products) {
            System.out.println(p.getDetails());
        }
    }
}


