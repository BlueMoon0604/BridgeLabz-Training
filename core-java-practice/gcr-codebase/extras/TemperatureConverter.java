import java.util.Scanner;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;   
        do {
            System.out.println("\n1 : Fahrenheit to Celsius");
            System.out.println("2 : Celsius to Fahrenheit");
            System.out.println("3 : Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter Temperature in Fahrenheit: ");
                double f = scanner.nextDouble();
                System.out.printf("Celsius: %.2f%n", fahrenheitToCelsius(f));
            } else if (choice == 2) {
                System.out.print("Enter Temperature in Celsius: ");
                double c = scanner.nextDouble();
                System.out.printf("Fahrenheit: %.2f%n", celsiusToFahrenheit(c));
            }
        } while (choice != 3);
        
        scanner.close();
    }
}
