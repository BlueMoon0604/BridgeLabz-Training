package eCommerce_Management;

class Product{
	private double price;
	private int productId;
	private String name;
	
	Product(int productId, double price, String name){
		this.price = price ;
		this.name = name;
		this.productId = productId;
	}
	public double getPrice() {
		return price ;
	}
	public String getName() {
		return name;
	}
}