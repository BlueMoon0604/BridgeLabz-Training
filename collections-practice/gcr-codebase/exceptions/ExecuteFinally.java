package collections;

import java.util.Scanner;

public class ExecuteFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number");
            int num1 = sc.nextInt();
            System.out.print("Enter second number");
            int num2 = sc.nextInt();
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid integers");
        } finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
