class customerAcc {
    String accountNumber;
    double balance;
    customerAcc(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    void checkBalance() {
        System.out.println("Account " + accountNumber + " balance: $" + balance);
    }
}
public class BankAccountManager {
    public static void main(String[] args) {
        customerAcc acc = new customerAcc("ACC123", 1000.0);
        acc.checkBalance();
        acc.deposit(650.0);
        acc.withdraw(200.0);
        acc.withdraw(2000.0);
        acc.checkBalance();
    }
}
