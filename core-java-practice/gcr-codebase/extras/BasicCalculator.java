import java.util.Scanner;

public class BasicCalculator {
    public static double addNumbers(double first, double second) {
        return first + second;
    }
    public static double subtractNumbers(double first, double second) {
        return first - second;
    }
    public static double multiplyNumbers(double first, double second) {
        return first * second;
    }
    public static double divideNumbers(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return first / second;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Multiplication");
            System.out.println("4 : Division");
            System.out.println("5 : Exit");
            System.out.print("Select operation (1-5): ");
            choice = input.nextInt();
            
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();
                
                try {
                    switch (choice) {
                        case 1 -> System.out.printf("Result: %.2f%n", addNumbers(num1, num2));
                        case 2 -> System.out.printf("Result: %.2f%n", subtractNumbers(num1, num2));
                        case 3 -> System.out.printf("Result: %.2f%n", multiplyNumbers(num1, num2));
                        case 4 -> System.out.printf("Result: %.2f%n", divideNumbers(num1, num2));
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        
        input.close();
    }
}
