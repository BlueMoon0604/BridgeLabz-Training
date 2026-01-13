package eCommerce_Management;

public interface Payment {
	void pay(double amount) throws PaymentFailedException;

}
