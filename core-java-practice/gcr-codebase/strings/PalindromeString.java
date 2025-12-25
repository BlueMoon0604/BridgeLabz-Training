import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        if (s.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

	}

}
