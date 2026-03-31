import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String s, String oldWord, String newWord) {
        return s.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        String result = replaceWord(s, oldWord, newWord);
        System.out.println("Modified sentence: " + result);
        sc.close();
    }
}
