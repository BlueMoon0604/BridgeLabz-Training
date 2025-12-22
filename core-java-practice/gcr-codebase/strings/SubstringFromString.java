import java.util.Scanner;

public class SubstringFromString {

    public static String substringWithCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); 
        int start = sc.nextInt();
        int end = sc.nextInt();

        // substring using custom method
        String custom = substringWithCharAt(input, start, end);
        // substring using built-in method
        String builtIn = input.substring(start, end);


        if (builtIn.equals(custom)) {
            System.out.println("Results are equal from both methods");
        } else {
            System.out.println("Results are not equal from both methods");
        }
    }
}
