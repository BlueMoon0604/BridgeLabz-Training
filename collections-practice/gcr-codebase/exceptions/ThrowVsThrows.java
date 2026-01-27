package collections;

public class ThrowVsThrows {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (rate < 0) {
            throw new IllegalArgumentException("Rate cannot be negative");
        }
        
        return amount * rate * years / 100;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        try {
            System.out.print("Enter principal amount ");
            double amount = sc.nextDouble();
            
            System.out.print("Enter interest rate ");
            double rate = sc.nextDouble();
            
            System.out.print("Enter years");
            int years = sc.nextInt();
            
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Interest: " + interest);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid numbers");
        } finally {
            sc.close();
        }
    }
}
