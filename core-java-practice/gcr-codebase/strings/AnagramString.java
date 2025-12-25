import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams.");
            return;
        }
        int[] count = new int[256];
        for (char c : s1.toCharArray()) {
            count[c]++;
        }
        for (char c : s2.toCharArray()) {
            count[c]--;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagrams.");
        } else {
            System.out.println("Not anagrams.");
        }

        sc.close();
    }
}
