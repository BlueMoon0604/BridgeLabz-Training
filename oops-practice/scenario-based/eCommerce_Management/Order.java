package eCommerce_Management;

public class Order {
	private int orderId;
	private Product product;
	private String status;
	
	Order(int orderId, Product product, String status){
		this.orderId = orderId;
		this.status = "Placed";
		this.product = product;
	}
	public void cancelOrder() {
		status = "Cancelled";
		System.out.println("order cancelled");
	}
	public void trackOrder() {
		System.out.println("order status " + status);
	}
	public double getAmount() {
		return product.getPrice();
	}

}
