import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    public static void generateException(String[] names) {
        String name = names[names.length + 1];
    }

    public static void handleException(String[] names) {
        try {
            String name = names[names.length + 1];
        } catch (Exception e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Error e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println(" Generating Exception ");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in main: " + e.getMessage());
        } catch (Error e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\n Handling Exception");
        handleException(names);
    }
}
