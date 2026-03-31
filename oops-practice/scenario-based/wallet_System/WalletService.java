package wallet_System;


public class WalletService {
    public void addMoney(User user, double amount) {
        user.getWallet().addMoney(amount);
    }
    public void withdrawMoney(User user, double amount)
            throws InsufficientBalanceException {
        user.getWallet().withdrawMoney(amount);
    }
    public void transferMoney(User from, User to,
                              double amount, TransferService service)
            throws InsufficientBalanceException {

        service.transfer(from.getWallet(), to.getWallet(), amount);
    }
    public void showHistory(User user) {
        user.getWallet().showTransactions();
    }
}
