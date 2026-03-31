import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Using loops to compare characters from start and end
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Using recursion to compare characters
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
        return java.util.Arrays.equals(original, reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check palindrome using all three methods
        boolean result1 = isPalindromeLoop(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeArray(input);
        System.out.println("Using loop: " + result1);
        System.out.println("Using recursion: " + result2);
        System.out.println("Using arrays: " + result3);
    }
}
