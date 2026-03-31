package wallet_System;

public class BankTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        double bankFee = 10;
        from.withdrawMoney(amount + bankFee);
        to.addMoney(amount);
    }
}

