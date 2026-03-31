import java.util.ArrayList;
import java.util.List;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
class Student {
    private String name;
    private String[] subjects;
    private int[] marks;
    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }
    private void validateMarks() throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Mark " + mark + " must be 0-100");
            }
        }
    }
    public double getAverage() {
        int sum = 0;
        for (int mark : marks) sum += mark;
        return (double) sum / marks.length;
    }
    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        if (avg >= 80) return "B";
        if (avg >= 70) return "C";
        if (avg >= 60) return "D";
        return "F";
    }
    public String getReport() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Student: %s (Grade: %s, Avg: %.1f)\n", name, getGrade(), getAverage()));
        sb.append("=====================================\n");
        for (int i = 0; i < subjects.length; i++) {
            sb.append(String.format("%s: %d\n", subjects[i], marks[i]));
        }
        return sb.toString();
    }
    public String getName() { return name; }
}
public class ReportGenerator {
    private List<Student> students = new ArrayList<>();
    public void addStudent(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        students.add(new Student(name, subjects, marks));
    }
    public void displayAllReports() {
        for (Student s : students) {
            System.out.println(s.getReport());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        String[] subjects = {"Math", "Science", "English", "History"};
        try {
            generator.addStudent("Alice", subjects, new int[]{95, 87, 92, 88});
            generator.addStudent("Bob", subjects, new int[]{78, 82, 85, 79});
            generator.addStudent("Charlie", subjects, new int[]{55, 60, 58, 62});
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
        generator.displayAllReports();
    }
}
