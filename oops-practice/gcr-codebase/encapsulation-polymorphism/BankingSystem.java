interface Loanable {
    void applyForLoan();
}
abstract class BankAccount {
    private String accountNumber, holderName;
    private double balance;
    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }
    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }
    abstract double calculateInterest();
    void display() {
        System.out.println(accountNumber + " (" + holderName + "): Balance $" + balance + ", Interest $" + calculateInterest());
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    double rate;
    SavingsAccount(String accountNumber, String holderName, double balance, double rate) {
        super(accountNumber, holderName, balance);
        this.rate = rate;
    }
    double calculateInterest() {
        return getBalance() * rate / 100;
    }
    public void applyForLoan() {
        System.out.println("Savings loan approved up to 50% balance");
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    double calculateInterest() {
        return 0;
    }
    public void applyForLoan() {
        System.out.println("Current account overdraft available");
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {new SavingsAccount("SAV001", "Alice", 10000, 4.5),new CurrentAccount("CUR001", "Bob", 5000)};
        for (BankAccount acc : accounts) {
            acc.display();
            ((Loanable)acc).applyForLoan();
        }
    }
}
