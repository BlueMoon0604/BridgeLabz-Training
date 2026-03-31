package inventory_management;


public class Main {
	public static void main(String[] args) {
		AlertService alertService = new LowStockAlertService();
		Inventory inventory1 = new Inventory(alertService);
		 Product p1 = new Product(4567, "Bread", 30, 6);
		 Product p2 = new Product(3456, "Garlic", 80, 5);
		inventory1.addProduct(p1);
		inventory1.addProduct(p2);
		inventory1.displayInventory();
		try {
			inventory1.updateProduct(4567, 3);
			inventory1.updateProduct(3456, 89);
		}catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
		inventory1.displayInventory();
	}

}
