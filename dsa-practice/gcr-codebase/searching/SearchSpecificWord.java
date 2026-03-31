package default_package;

public class SearchSpecificWord {
    public static String searchSentence(String[] sentences, String word) {
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].toLowerCase().contains(word.toLowerCase())) {
                return sentences[i];
            }
        }

        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
                "Java is a powerful programming language",
                "I love learning data structures",
                "Linear search is easy to understand",
                "Practice makes a man perfect"
        };
        String wordToSearch = "search";
        String result = searchSentence(sentences, wordToSearch);
        System.out.println("Result: " + result);
    }
}
