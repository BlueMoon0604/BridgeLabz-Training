class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public void displayAccountInfo() {
        System.out.printf("Account: %s, Holder: %s, Balance: ₹%.2f%n", 
                         accountNumber, accountHolder, balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    SavingsAccount(String accountNumber, String accountHolder, 
                  double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    
    public void updateHolderName(String newName) {
        this.accountHolder = newName;
    }
    
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
    
    public void displaySavingsInfo() {
        System.out.printf("Savings - Account: %s, Holder: %s, Balance: ₹%.2f, Rate: %.1f%%%n",
                         accountNumber, accountHolder, getBalance(), interestRate);
    }
    public static void main(String[] args) {
        System.out.println("=== Regular Bank Account ===");
        BankAccount account = new BankAccount("ACC123456", "Rohan Sharma", 50000.0);
        account.displayAccountInfo();
        
        System.out.println("\nTransactions:");
        account.deposit(15000.0);
        account.withdraw(8000.0);
        System.out.println("Balance: ₹" + account.getBalance());
        account.displayAccountInfo();
        
        System.out.println("\n=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount("SAV789012", "Priya Patel", 75000.0, 4.5);
        savings.displaySavingsInfo();
        
        System.out.println("\nHolder name update from subclass:");
        savings.updateHolderName("Priya R. Patel");
        savings.applyInterest();
        savings.displaySavingsInfo();
    }
}

