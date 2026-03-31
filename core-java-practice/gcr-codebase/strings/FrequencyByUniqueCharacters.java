import java.util.Scanner;

public class FrequencyByUniqueCharacters {

    // To find unique characters in the string
    public static char[] findUniqueChars(String str) {
        int len = findLength(str);
        char[] uniqueChars = new char[len]; 
        int count = 0;
        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false; 
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[count] = currentChar;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // To find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    // To find frequency of unique characters
    public static String[][] findFrequencies(String str) {
        int[] freq = new int[256]; // ASCII size
        int len = findLength(str);

        // Count frequency for each character
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        char[] uniqueChars = findUniqueChars(str);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    // To display character frequencies
    public static void displayFrequencies(String[][] freqArray) {
        System.out.println("Character\tFrequency");
        for (String[] entry : freqArray) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] freqs = findFrequencies(input);
        displayFrequencies(freqs);
    }
}
