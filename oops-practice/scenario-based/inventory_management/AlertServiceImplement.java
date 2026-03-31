package inventory_management;

class LowStockAlertService implements AlertService{
	public void sendLowStockAlert(Product product) {
		System.out.println("Low Stock Alert for this product => "+product.getName());
	}
}