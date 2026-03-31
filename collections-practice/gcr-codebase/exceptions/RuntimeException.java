package collections;

import java.util.Scanner;

public class RuntimeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter first number");
                double num1 = sc.nextDouble();
                
                System.out.print("Enter second number");
                double num2 = sc.nextDouble();
                
                double result = num1 / num2;
                System.out.println("Result: " + result);
                break;
                
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please try again");
                sc.nextLine();
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter numeric values only");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
