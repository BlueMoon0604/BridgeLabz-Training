package student_CourseSystem;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Navya");
        RegistrationService service = new Service();
        try {
            service.enroll(student, "Maths");
            service.enroll(student, "Social Science");
            service.enroll(student, "Hindi");
            service.enroll(student, "SST"); 
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }
        student.addGrade("Maths", "A+");
        student.addGrade("Social Science", "A+");

        service.viewGrades(student);
    }
}
  