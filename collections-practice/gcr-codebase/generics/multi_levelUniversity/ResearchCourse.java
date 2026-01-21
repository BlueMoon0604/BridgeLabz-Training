package multi_levelUniversity;

public class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
    public double calculateGrade(int score) {
        return score / 200.0 * 100;
    }
}

