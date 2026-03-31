package bankSystemManagement;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(101, "Nova", 150000);
        Account current = new CurrentAccount(102, "Carlos", 48000);
        savings.deposit(45000);
        System.out.println("Savings Balance: Rs. " + savings.getBalance());
        System.out.println("Current Balance: Rs. " + current.getBalance());
        try {
            savings.transfer(current, 1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        Thread t1 = new Transaction(savings, 2000);
        Thread t2 = new Transaction(savings, 3000);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Savings Interest: Rs. " + savings.calculateInterest());
        System.out.println("Current Interest: Rs. " + current.calculateInterest());
        savings.printTransactionHistory();
        current.printTransactionHistory();
    }
}
