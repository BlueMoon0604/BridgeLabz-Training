package wallet_System;

public class WalletToWalletTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {
        from.withdrawMoney(amount);
        to.addMoney(amount);
    }
}

