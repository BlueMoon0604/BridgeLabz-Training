package m1Questions;

import java.util.Scanner;

public class KeyGeneration {
    public static String generatedString(String input) {
        if (input == null || input.length() == 0) {
            return "Invalid Input (empty string)";
        }

        if (input.length() < 6) {
            return "Invalid Input (length < 6)";
        }

        if (input.contains(" ")) {
            return "Invalid Input (contains space)";
        }

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                return "Invalid Input (contains digits)";
            }
            if (!Character.isLetter(ch)) {
                return "Invalid Input (contains special character)";
            }
        }

        String transform = input.toLowerCase();
        StringBuilder filtered = new StringBuilder();

        for (char ch : transform.toCharArray()) {
            if ((int) ch % 2 != 0) {
                filtered.append(ch);
            }
        }

        if (filtered.length() == 0) {
            return "Invalid Input (empty string)";
        }

        filtered.reverse();

        StringBuilder key = new StringBuilder();
        for (int i = 0; i < filtered.length(); i++) {
            char ch = filtered.charAt(i);

            if (i % 2 == 0) {
                key.append(Character.toUpperCase(ch));
            } else {
                key.append(ch);
            }
        }

        return "The generated key is - " + key.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
        	System.out.println("Enter string " + (i + 1));
            String input = sc.nextLine();
            System.out.println(generatedString(input));
        }

        sc.close();
    }
}