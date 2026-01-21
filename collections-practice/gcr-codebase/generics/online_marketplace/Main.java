package online_marketplace;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        
        catalog.addProduct(new Product<>("B001", "The fourth wings", 49.99, Category.FICTION));
        catalog.addProduct(new Product<>("B002", "Data Structures", 59.99, Category.NONFICTION));
        
        catalog.addProduct(new Product<>("C001", "T-Shirt", 19.99, Category.SHIRTS));
        
        catalog.addProduct(new Product<>("G001", "Samsung", 999.99, Category.PHONE));
        
        System.out.println("Initial Catalog:");
        catalog.displayAll();
        
        System.out.println("Applying Discounts:");
        catalog.applyDiscount(catalog.products.get(0), 10.0);  
        catalog.applyDiscount(catalog.products.get(3), 5.0);   
        
        System.out.println("Updated Catalog:");
        catalog.displayAll();
    }
}
