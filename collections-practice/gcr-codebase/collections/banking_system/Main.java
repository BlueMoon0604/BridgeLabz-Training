package banking_system;

public class Main{
    public static void main(String[] args) {
        BankManager bank = new BankManager();
        bank.addAccount(new Account(1, 50000));
        bank.addAccount(new Account(2, 23000));
        bank.addAccount(new Account(3, 98000));

        bank.requestWithdrawal(1, 1500);
        bank.requestWithdrawal(2, 100);
        bank.requestWithdrawal(3, 34000);

        bank.processWithdrawals();
        bank.displaySortedByBalance();
    }
}
