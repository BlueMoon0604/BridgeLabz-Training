import java.util.Scanner;

public class NonRepeating {

    // To find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; 
        int len = text.length();
        // Count frequency of each character
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        for (int i = 0; i < len; i++) {  // Find the first non-repeating character
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        return '\0'; // null character if non repeating not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
