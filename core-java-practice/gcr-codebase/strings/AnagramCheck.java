import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String text1, String text2) {
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Array to store frequency of characters 
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            freq1[ch]++;
        }

        // Count frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            freq2[ch]++;
        }

        // Compare both arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();
        boolean result = areAnagrams(text1, text2);
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
