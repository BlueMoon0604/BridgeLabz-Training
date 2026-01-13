package student_CourseSystem;

public interface RegistrationService {
	 void enroll(Student student, String course) throws CourseLimitExceededException;
	    void drop(Student student, String course);
	    void viewGrades(Student student);
}
