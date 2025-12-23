import java.util.Scanner;

public class ShortestAndLongest{
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
        wordCount++; 

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

    // create 2D array of word and length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(length);
        }
        return wordLengthArray;
    }

    // find shortest and longest word from 2D array
    public static String[] findShortestLongest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];
        int shortestLen = Integer.parseInt(wordLengthArray[0][1]);
        int longestLen = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] row : wordLengthArray) {
            int len = Integer.parseInt(row[1]);
            if (len < shortestLen) {
                shortest = row[0];
                shortestLen = len;
            }
            if (len > longestLen) {
                longest = row[0];
                longestLen = len;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        // Split words using custom method
        String[] words = splitWords(input);
        // Create 2D array of word and length
        String[][] wordLengthArray = createWordLengthArray(words);
        // Find shortest and longest words
        String[] result = findShortestLongest(wordLengthArray);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}

