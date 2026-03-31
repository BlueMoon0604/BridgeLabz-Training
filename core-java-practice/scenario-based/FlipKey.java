package default_package;

import java.util.Scanner;

public class FlipKey {
    
    public static String CleanseAndInvert(String input) {
        if (input == null || input.length() < 6) {
            return "";
        }
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                return "";
            }
        }
        String lowerInput = input.toLowerCase();
        StringBuilder filtered = new StringBuilder();
        for (char c : lowerInput.toCharArray()) {
            if ((int)c % 2 != 0) { 
                filtered.append(c);
            }
        }
        String reversed = filtered.reverse().toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(reversed.charAt(i)));
            } else {
                result.append(reversed.charAt(i));
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = CleanseAndInvert(input);
        
        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }
        scanner.close();
    }
}

