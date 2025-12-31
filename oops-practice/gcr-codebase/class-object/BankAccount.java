public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    
    void deposit(double amt) {
        balance += amt;
        System.out.printf("Deposited: %.1f%n", amt);
        System.out.printf("Current balance: %.1f%n", balance);
    }
    void withdraw(double amt) {
        System.out.printf("Withdraw amount is : %.1f%n", amt);
        if (balance >= amt) {
            balance -= amt;
            System.out.printf("Current balance is : %.1f%n", balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void displayBalance() {
        System.out.printf("Current balance is : %.1f%n", balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "State of Chennai";
        account.accountNumber = "12345";
        account.balance = 700.0;
        System.out.println("State of Chennai");
        System.out.println();
        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(900.0);
    }
}
