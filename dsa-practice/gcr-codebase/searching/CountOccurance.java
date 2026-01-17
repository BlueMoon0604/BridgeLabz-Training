package default_package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurance {
    public static int countWordOccurrences(String filename, String targetWord) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");  
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return count;
    }
    public static void main(String[] args) {
        String filename = "sample.txt";
        String wordToFind = "cherry";
        int occurrences = countWordOccurrences(filename, wordToFind);
        System.out.println("Word '" + wordToFind + "' appears " + 
                          occurrences + " times in " + filename);
    }
}
