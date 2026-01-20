package banking_account;

class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public double calculateFee() {
        return getBalance() < 1000.0 ? 1.0 : 0.0;
    }
}

