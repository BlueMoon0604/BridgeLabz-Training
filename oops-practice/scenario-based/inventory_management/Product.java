package inventory_management;

public class Product {
	private int productId ;
	private String name;
	private double price;
	private int quantity;
	private int lowThresholdStock;
	
	Product(int productId, String name,int quantity, int lowThresholdStock ){
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.lowThresholdStock = lowThresholdStock;
	}
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getLowThresholdStock() {
		return lowThresholdStock;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isLowStock() {
		return quantity <= lowThresholdStock;
	}
	public void displayProduct() {
		System.out.println("ProductId => " + productId + ",Product Name => "+name+", Quantity => " + quantity);
	}
	

}
