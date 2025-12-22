import java.util.Scanner;

public class IllegalArgumentException {

    public static void generateException(String text) {
        String sub = text.substring(3, 1);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(3, 1);
        } catch (Exception e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (Error e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println(" Generating Exception ");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Caught IllegalArgumentException in main: " + e.getMessage());
        } catch (Error e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling Exception");
        handleException(text);
    }
}
