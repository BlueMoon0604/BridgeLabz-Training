import java.util.Scanner;

public class FrequencyByCharAt {

    // To find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++) { // Count frequency of each character
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] freqArray = findFrequency(input);
        System.out.println("Character\tFrequency");
        for (String[] row : freqArray) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
