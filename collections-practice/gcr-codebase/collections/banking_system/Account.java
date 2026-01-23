package banking_system;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    public String toString() {
        return "Account No: " + accountNumber + ", Balance: ₹" + balance;
    }
}

