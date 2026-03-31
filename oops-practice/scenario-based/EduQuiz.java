public class EduQuiz {
    static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                score++;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "C", "B", "D", "A","B", "C", "D", "A", "B"};
        String[] studentAnswers = {"a", "n", "b", "d", "b","a", "c", "b", "b", "b"};
        int score = calculateScore(correctAnswers, studentAnswers);
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        double percentage = (score / 10.0) * 100;
        System.out.println("\nScore: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");
        if(percentage >= 50) {
            System.out.println("Result: Pass");
        }else {
            System.out.println("Result: Fail");
        }
    }
}
