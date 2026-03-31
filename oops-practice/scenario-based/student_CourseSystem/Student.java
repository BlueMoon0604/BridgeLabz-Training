package student_CourseSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student extends Person{
	private List<String> enrolledCourses = new ArrayList<>();
    private Map<String, String> grades = new HashMap<>();
    private static final int MAX_COURSES = 3;

    public Student(int id, String name) {
        super(id, name);
    }
    public void enrollCourse(String course) throws CourseLimitExceededException {
        if (enrolledCourses.size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Course limit exceeded");
        }
        enrolledCourses.add(course);
    }
    public void dropCourse(String course) {
        enrolledCourses.remove(course);
        grades.remove(course);
    }
    public void addGrade(String course, String grade) {
        grades.put(course, grade);
    }
    public List<String> getCourses() {
        return enrolledCourses;
    }
    public Map<String, String> getGrades() {
        return grades;
    }
	
}