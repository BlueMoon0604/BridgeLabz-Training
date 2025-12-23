import java.util.Scanner;

public class TrimSpaces {

    // To find start and end indices after trimming leading/trailing spaces
    public static int[] findTrimIndices(String str) {
        int len = str.length();
        int start = 0;
        int end = len - 1;
        // Trim leading spaces
        while (start < len && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // To create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // To compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find start and end indices for trimming
        int[] indices = findTrimIndices(input);
        int start = indices[0];
        int end = indices[1];
        // Create substring using charAt()
        String trimmedCustom = createSubstring(input, start, end);
        // Use built-in trim() method
        String trimmedBuiltIn = input.trim();

        // Compare results
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Original string: \"" + input + "\"");
        System.out.println("Custom trimmed: \"" + trimmedCustom + "\"");
        System.out.println("Built-in trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Both results match: " + isEqual);
    }
}
