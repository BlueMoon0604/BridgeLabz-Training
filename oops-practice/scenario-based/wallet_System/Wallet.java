package wallet_System;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public double getBalance() {
        return balance;
    }
    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("CREDIT", amount));
    }
    public void withdrawMoney(double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        transactions.add(new Transaction("DEBIT", amount));
    }
    public void recordTransaction(Transaction tx) {
        transactions.add(tx);
    }
    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
