package onlineExamSystem;

public class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(Exam exam, Student student) {
        return exam.getQuestions().size() * 5;
    }
}
