package student_CourseSystem;

import java.util.Map;

public class Service implements RegistrationService {
    public void enroll(Student student, String course)
            throws CourseLimitExceededException {
        student.enrollCourse(course);
        System.out.println("Enrolled in: " + course);
    }
    public void drop(Student student, String course) {
        student.dropCourse(course);
        System.out.println("Dropped course: " + course);
    }
    public void viewGrades(Student student) {
        System.out.println("Grades:");
        for (Map.Entry<String, String> entry : student.getGrades().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
