package DigitalPaymentInterface;

public class Main {

	public static void main(String[] args) {
		Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(8000);
        card.pay(145000);
        wallet.pay(3050);
	}

}
