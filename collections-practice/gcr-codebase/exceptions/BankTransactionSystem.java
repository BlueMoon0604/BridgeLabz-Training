package collections;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class BankTransactionSystem {
    private double balance;
    public BankTransactionSystem(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        BankTransactionSystem account = new BankTransactionSystem(1000.0);
        
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Withdrawal successful, new balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number");
        } finally {
            sc.close();
        }
    }
}
