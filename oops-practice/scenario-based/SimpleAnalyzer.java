import java.util.Scanner;
public class SimpleAnalyzer {
    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }
    public static String longestWord(String s) {
        s = s.trim();
        if (s.isEmpty()) return "";
        String[] words = s.split("\\s+");
        String max = "";
        for (String w : words) {
            if (w.length() > max.length()) max = w;
        }
        return max;
    }
    public static String replaceWord(String s, String from, String to) {
        if (s == null || from == null || from.isEmpty()) return s;
        return s.replaceAll("(?i)\\b" + java.util.regex.Pattern.quote(from) + "\\b", to);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter paragraph: ");
        String para = sc.nextLine();
        System.out.println("Words: " + countWords(para));
        System.out.println("Longest: " + longestWord(para));
        System.out.print("Replace: ");
        String from = sc.nextLine();
        System.out.print("With: ");
        String to = sc.nextLine();
        
        System.out.println("Result: " + replaceWord(para, from, to));
        sc.close();
    }
}
