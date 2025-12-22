import java.util.Scanner;

public class ReturnCharacters {

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareStrings(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // User-defined method
        char[] userDefinedArray = getChars(input);
        // Built-in toCharArray()
        char[] builtInArray = input.toCharArray();
        // Compare both arrays
        boolean areEqual = compareStrings(userDefinedArray, builtInArray);
        System.out.println("User-defined array: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nBuilt-in toCharArray() array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both arrays equal? " + areEqual);
    }
}
