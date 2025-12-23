import java.util.Scanner;

public class Length {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Access character at index 'count'
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception thrown when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next(); // user input

        // Call user-defined method
        int lengthCustom = findLength(s);
        // Call built-in length() method
        int lengthBuiltIn = s.length();
        System.out.println("Length (custom method): " + lengthCustom);
        System.out.println("Length (built-in method): " + lengthBuiltIn);
    }
}
