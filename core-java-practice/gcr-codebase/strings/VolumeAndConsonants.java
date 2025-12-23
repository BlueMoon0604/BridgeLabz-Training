import java.util.Scanner;

public class VolumeAndConsonants {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase
        }
        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'p') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // To count vowels and consonants in a string
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            String result = checkVowelOrConsonant(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsConsonants(input);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
