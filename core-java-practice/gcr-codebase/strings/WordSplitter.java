import java.util.Scanner;

public class WordSplitter {
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
        spaceIndexes[index] = len;

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

    // compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        // Split using user-defined method
        String[] wordsCustom = splitWords(s);
        // Split using built-in split() method
        String[] wordsBuiltIn = s.split(" ");
        boolean areEqual = compareArrays(wordsCustom, wordsBuiltIn);
        System.out.println("Words (custom method):");
        for (String word : wordsCustom) {
            System.out.println(word);
        }

        System.out.println("\nWords (built-in split method):");
        for (String word : wordsBuiltIn) {
            System.out.println(word);
        }

        System.out.println("\nBoth methods give same result: " + areEqual);
    }
}
