package banking_account;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("12345", 1560000.0);
        System.out.printf("%.2f%n", savings.calculateFee());

        BankAccount savingsLow = new SavingsAccount("11111", 5000000.0);
        System.out.printf("%.2f%n", savingsLow.calculateFee());

        BankAccount checkingHigh = new CheckingAccount("22222", 100000.0);
        System.out.printf("%.2f%n", checkingHigh.calculateFee());

        BankAccount checkingLow = new CheckingAccount("33333", 50000.0);
        System.out.printf("%.2f%n", checkingLow.calculateFee());
    }
}
