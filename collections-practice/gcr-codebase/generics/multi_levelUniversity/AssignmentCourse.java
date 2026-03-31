package multi_levelUniversity;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
    public double calculateGrade(int score) {
        return score / 50.0 * 100;
    }
}
