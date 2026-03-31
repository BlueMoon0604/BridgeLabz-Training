package banking_system;

import java.util.*;

public class BankManager {
    private Map<Integer, Account> accountMap = new HashMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }
    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }
    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            Account account = accountMap.get(request.getAccountNumber());

            if (account != null && account.getBalance() >= request.getAmount()) {
                account.withdraw(request.getAmount());
                System.out.println("Withdrawal successful: " + account);
            } else {
                System.out.println("Withdrawal failed for Account No: " +
                        request.getAccountNumber());
            }
        }
    }
    public void displaySortedByBalance() {
        TreeMap<Double, List<Account>> sortedMap = new TreeMap<>();

        for (Account account : accountMap.values()) {
            sortedMap
                .computeIfAbsent(account.getBalance(), k -> new ArrayList<>())
                .add(account);
        }
        System.out.println("\nCustomers sorted by balance:");
        for (List<Account> accounts : sortedMap.values()) {
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}
