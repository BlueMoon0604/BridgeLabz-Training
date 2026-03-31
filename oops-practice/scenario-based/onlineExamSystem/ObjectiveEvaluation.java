package onlineExamSystem;

public class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(Exam exam, Student student) {
        int score = 0;
        for (Questions q : exam.getQuestions()) {
            String ans = student.getAnswers().get(q.getId());
            if (ans != null && ans.equalsIgnoreCase(q.getCorrectAnswer())) {
                score += q.getMarks();
            }
        }
        return score;
    }
}
