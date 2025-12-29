import java.util.Scanner;

public class PalindromeChecker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = getInput(sc);
        boolean isPalindrome = checkPalindrome(s);
        displayResult(s, isPalindrome);
        sc.close();
    }
    private static String getInput(Scanner sc) {
        System.out.print("Enter a string : ");
        return sc.nextLine().toLowerCase();
    }
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    private static void displayResult(String original, boolean result) {
        if (result) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
