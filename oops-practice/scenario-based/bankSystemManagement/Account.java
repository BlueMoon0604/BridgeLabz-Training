package bankSystemManagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements BankService {
    protected int accountNumber;
    protected String holderName;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        transactions.add("Account created with balance: " + balance);
    }
    public abstract double calculateInterest(); 
    public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println(holderName + " deposited ₹" + amount);
    }
    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
        System.out.println(holderName + " withdrew ₹" + amount);
    }
    public synchronized void transfer(Account toAccount, double amount)
            throws InsufficientBalanceException {
        this.withdraw(amount);
        toAccount.deposit(amount);
        transactions.add("Transferred Amount Rs. " + amount + " to " + toAccount.holderName);
    }
    public double getBalance() {
        return balance;
    }
    public void printTransactionHistory() {
        System.out.println("Transaction History for " + holderName);
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
