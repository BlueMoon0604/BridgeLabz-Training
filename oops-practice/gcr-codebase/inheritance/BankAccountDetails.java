class BankAccount {
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType() {
        System.out.println("Generic Bank Account - #" + accountNumber + ", Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    protected double interestRate; 
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType() {
        System.out.println("Savings Account - #" + accountNumber + ", Balance: $" + balance + 
                          ", Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    protected double withdrawalLimit; 
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Checking Account - #" + accountNumber + ", Balance: $" + balance + 
                          ", Withdrawal Limit: $" + withdrawalLimit + "/day");
    }
}
class FixedDepositAccount extends BankAccount {
    protected int tenureMonths;
    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account - #" + accountNumber + 
                          ", Balance: $" + balance + 
                          ", Tenure: " + tenureMonths + " months");
    }
}
public class BankAccountDetails {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SAV001", 75000.0, 3.5), new CheckingAccount("CHK001", 12000.0, 1000.0),
            new FixedDepositAccount("FD001", 100000.0, 12),
            new BankAccount("GEN001", 71000.0)
        };
        for (BankAccount ac : accounts) {
            ac.displayAccountType();
        }
    }
}
