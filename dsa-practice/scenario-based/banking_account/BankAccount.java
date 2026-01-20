package banking_account;

abstract class BankAccount {
    private final String accountNumber;
    private final double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public abstract double calculateFee();
}

