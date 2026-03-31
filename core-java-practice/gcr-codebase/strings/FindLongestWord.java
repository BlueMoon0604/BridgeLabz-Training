import java.util.Scanner;

public class FindLongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
     
    }
}
