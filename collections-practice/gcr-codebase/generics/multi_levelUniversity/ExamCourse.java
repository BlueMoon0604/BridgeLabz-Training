package multi_levelUniversity;

public class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
    public double calculateGrade(int score) {
        return score / 100.0 * 100;
    }
}
