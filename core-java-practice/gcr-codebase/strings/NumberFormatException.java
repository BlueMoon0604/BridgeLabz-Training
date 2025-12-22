import java.util.Scanner;

public class NumberFormatException {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
        } catch (Exception e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Error e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (e.g., abc, xyz, hello): ");
        String s = scanner.nextLine();

        System.out.println(" Generating Exception ");
        try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Caught NumberFormatException in main: " + e.getMessage());
        } catch (Error e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\n Handling Exception ");
        handleException(s);
    }
}
