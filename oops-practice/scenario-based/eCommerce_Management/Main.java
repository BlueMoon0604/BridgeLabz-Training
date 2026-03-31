package eCommerce_Management;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product(2300, 350, "Bread");
		Customer customer1 = new Customer(1, "Nova");
		Order order1 = new Order(3478, product1, null);
		Payment payment1 = new WalletPayment();
		try {
			payment1.pay(order1.getAmount());
			order1.trackOrder();
		}catch(PaymentFailedException e) {
			System.out.println("Payment failed" + e.getMessage());
		}
		
		
	}

}
