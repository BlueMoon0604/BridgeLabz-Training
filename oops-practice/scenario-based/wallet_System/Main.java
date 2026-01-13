package wallet_System;

public class Main {
    public static void main(String[] args) {
        WalletService service = new WalletService();
        User u1 = new User(1, "Nova");
        User u2 = new User(2, "Aaron");
        service.addMoney(u1, 5000);
        try {
            service.transferMoney(
                    u1, u2, 1000,
                    new WalletToWalletTransfer());

            service.transferMoney(
                    u1, u2, 500,
                    new BankTransfer());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nova Transactions:");
        service.showHistory(u1);

        System.out.println("Aaron Transactions:");
        service.showHistory(u2);
    }
}

