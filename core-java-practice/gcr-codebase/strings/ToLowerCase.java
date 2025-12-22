import java.util.Scanner;

public class ToLowerCase {

    public static String toLowerCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);// using ASCII Difference
            }
            result.append(ch);
        }
        return result.toString();
    }

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String builtInLower = input.toLowerCase(); //  built-in toLowerCase()
        //manual method
        String manualLower = toLowerCaseManual(input);

        boolean areEqual = compareStrings(builtInLower, manualLower);
        System.out.println("Is both results from builtIn and manual method are same ? " + areEqual);
    }
}
