package eCommerce_Management;

class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if(amount > 50000) {
            throw new PaymentFailedException("Card limit exceeded");
        }
        System.out.println("Paid " + amount + " using Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
