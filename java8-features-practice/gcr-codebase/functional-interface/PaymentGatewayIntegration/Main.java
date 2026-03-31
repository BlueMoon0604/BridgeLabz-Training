package PaymentGatewayIntegration;

public class Main {
	public static void main(String[] args) {

        PaymentProcessor upi = new UpiPayment();
        PaymentProcessor card = new CreditCardPayment();
        PaymentProcessor wallet = new WalletPayment();

        upi.pay(5000);
        upi.refund(1000);

        card.pay(150000);
        card.refund(4000);

        wallet.pay(10000);
        wallet.refund(400);
    }
}
