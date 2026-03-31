package onlineExamSystem;

import java.util.ArrayList;
import java.util.List;
public class Exam {

    private int examId;
    private String title;
    private boolean active = true;
    private List<Questions> questions = new ArrayList<>();
    public Exam(int examId, String title) {
        this.examId = examId;
        this.title = title;
    }
    public void addQuestion(Questions q) {
        questions.add(q);
    }
    public List<Questions> getQuestions() {
        return questions;
    }
    public void submitExam(Student student) throws ExamTimeExpiredException {
        if (!active) {
            throw new ExamTimeExpiredException("Exam time expired!");
        }
        active = false;
        System.out.println(student.getName() + " submitted the exam.");
    }
    public int generateResult(Student student, EvaluationStrategy strategy) {
        return strategy.evaluate(this, student);
    }
}
