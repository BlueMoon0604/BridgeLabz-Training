import java.util.Scanner;

public class WordLength {

  //Length without using length()
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

    public static String[] splitWords(String text) {
        int wordCount = 0;
        int len = findLength(text);

        // Count the number of words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Last word after last space

        // Create array to store space indexes
        int[] spaceIndexes = new int[wordCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = len; // Add end index

        // Create array to store words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            start = end + 1;
        }

        return words;
    }

    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(length);
        }
        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        // Split words using custom method
        String[] words = splitWords(s);
        // Create 2D array of word
        String[][] wordLengthArray = createWordLengthArray(words);
        System.out.println("\nWord\tLength");
        for (String[] row : wordLengthArray) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            System.out.println(word + "\t" + length);
        }
    }
}
