import java.util.Scanner;

public class SentenceFormatter {
    
    public static String fixText(String text) {
        String removeSpaces = text.trim().replaceAll(" +", " ");
        StringBuilder res = new StringBuilder();
        boolean newSentence = true;
        for (int i = 0; i < removeSpaces.length(); i++) {
            char c = removeSpaces.charAt(i);
            if(newSentence && Character.isLowerCase(c)) {
                res.append(Character.toUpperCase(c));
                newSentence = false;
            }else {
                res.append(c);
            }if(c == '.' || c == '?' || c == '!') {
                newSentence = true;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unformatted text : ");
        String sentence = sc.nextLine();
        System.out.println("Fixed: " + fixText(sentence));
        sc.close();
    }
}
