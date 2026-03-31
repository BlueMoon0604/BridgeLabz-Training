import java.util.ArrayList;
import java.util.List;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}
public class QuizPlatform {
    public static int calculateScore(String[] correct, String[] user) 
            throws InvalidQuizSubmissionException {
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Length mismatch");
        }
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) score++;
        }
        return score;
    }
    public static String getGrade(int score, int total) {
        double pct = (double) score / total * 100;
        if (pct >= 90) return "A";
        if (pct >= 80) return "B";
        if (pct >= 70) return "C";
        if (pct >= 60) return "D";
        return "F";
    }
    public static List<Integer> processUsers(List<String[]> corrects, List<String[]> users) {
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < corrects.size(); i++) {
            try {
                scores.add(calculateScore(corrects.get(i), users.get(i)));
            } catch (InvalidQuizSubmissionException e) {
                scores.add(0);
            }
        }
        return scores;
    }
    public static void main(String[] args) {
        String[] correct = {"A", "B", "C", "D"};
        List<String[]> corrects = List.of(correct, correct);
        List<String[]> users = List.of(
            new String[]{"A", "B", "X", "D"},
            new String[]{"X", "Y", "Z"}
        );
        List<Integer> scores = processUsers(corrects, users);
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("User " + i + ": " + scores.get(i) + " - " + 
                getGrade(scores.get(i), correct.length));
        }
    }
}

