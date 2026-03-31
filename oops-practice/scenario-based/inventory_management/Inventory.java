package inventory_management;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> products = new ArrayList<>();
	private AlertService alertService;
	public Inventory(AlertService alertService) {
		this.alertService = alertService;
	}
	public void addProduct(Product product) {
		products.add(product);
		System.out.println("Product added => " + product.getName());
	}
	public void updateProduct(int productId, int newQuantity)
	        throws OutOfStockException {
	    for (Product product : products) {
	        if (product.getProductId() == productId) {
	            if (newQuantity < 0) {
	                throw new OutOfStockException("Stock cannot be negative");
	            }
	            product.setQuantity(newQuantity);
	            System.out.println("Stock updated for " + product.getName());

	            if (product.isLowStock()) {
	                alertService.sendLowStockAlert(product);
	            }
	            return;
	        }
	    }
	    System.out.println("Product not found!");
	}
	public void displayInventory() {
		for(Product product : products) {
			product.displayProduct();
		}
	}
}
