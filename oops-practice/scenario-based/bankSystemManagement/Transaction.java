package bankSystemManagement;

public class Transaction extends Thread {
    private Account account;
    private double amount;
    public Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
