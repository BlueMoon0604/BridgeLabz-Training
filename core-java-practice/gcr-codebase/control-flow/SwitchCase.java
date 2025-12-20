import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        double result = 0;
        boolean validOutput = true;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by zero.");
                    validOutput = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOutput = false;
        }
        if (validOutput) {
            System.out.println("Result: " + result);
        }

        
    }
}
