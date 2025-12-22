import java.util.Scanner;

public class ToUpperCase {

   
    public static String toUpperCaseManual(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
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
        // BuiltIn Method
        String builtInUpper = input.toUpperCase();

        //  manual method
        String manualUpper = toUpperCaseManual(input);
        boolean areEqual = compareStrings(builtInUpper, manualUpper);
        System.out.println("Is both results from builtIn and manual method are same ? " + areEqual);
        
    }
		
}
