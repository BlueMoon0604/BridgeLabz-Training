package multi_levelUniversity;

public abstract class CourseType {
    protected String typeName;
    
    public CourseType(String typeName) {
        this.typeName = typeName;
    }
    public abstract double calculateGrade(int score);
    public String getTypeName() {
        return typeName;
    }
}
