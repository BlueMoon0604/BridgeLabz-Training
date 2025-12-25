import java.util.Scanner;

public class LexographicalCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = 0;
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (result == 0) {
            result = str1.length() - str2.length();
        }

        if (result < 0) {
            System.out.println("First string is smaller.");
        } else if (result > 0) {
            System.out.println("Second string is smaller.");
        } else {
            System.out.println("Strings are equal.");
        }

        sc.close();
    }
}
