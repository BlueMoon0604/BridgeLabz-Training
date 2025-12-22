

import java.util.Scanner;

public class StringIndexOutOfBoundsException {

    public static void generateException(String text) {
        char ch = text.charAt(text.length() + 1);
    }

    public static void handleException(String text) {
        try {
            char ch = text.charAt(text.length() + 1);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Generating Exception");
        try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception ===");
        handleException(s);
    }
}
