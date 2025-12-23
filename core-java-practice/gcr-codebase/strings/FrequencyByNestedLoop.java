import java.util.Scanner;

public class FrequencyByNestedLoop {

    // To find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray(); 
        int[] freq = new int[chars.length]; 

        for (int i = 0; i < chars.length; i++) { // Initialize frequency array
            freq[i] = 1;
        }

        // Nested loop to count frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { 
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0'; 
                    }
                }
            }
        }

        String[] result = new String[chars.length];// created array to store results
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + ": " + freq[i];
            }
        }

        String[] trimmedResult = new String[index];
        for (int i = 0; i < index; i++) {
            trimmedResult[i] = result[i];
        }

        return trimmedResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] freqResult = findFrequency(input);
        System.out.println("Character Frequencies:");
        for (String entry : freqResult) {
            System.out.println(entry);
        }
    }
}
