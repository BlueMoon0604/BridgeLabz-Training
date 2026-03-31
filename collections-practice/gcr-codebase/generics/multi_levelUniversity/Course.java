package multi_levelUniversity;

public class Course<T extends CourseType> {
    private String courseName;
    private T courseType;
    
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public double evaluateStudent(int rawScore) {
        return courseType.calculateGrade(rawScore);
    }
    public void displayDetails() {
        System.out.println(courseName + " (" + courseType.getTypeName() + ")");
    }
    public T getCourseType() {
        return courseType;
    }
}
