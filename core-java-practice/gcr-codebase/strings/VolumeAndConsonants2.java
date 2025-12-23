import java.util.Scanner;

public class VolumeAndConsonants2 {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        // Convert to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase
        }
        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // To create a 2D array with each character and its type
    public static String[][] getCharTypeArray(String str) {
        int len = str.length();
        String[][] charTypeArray = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            charTypeArray[i][0] = String.valueOf(ch);
            charTypeArray[i][1] = checkVowelOrConsonant(ch);
        }

        return charTypeArray;
    }
    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] charTypeArray = getCharTypeArray(input);
        displayTable(charTypeArray);
    }
}
