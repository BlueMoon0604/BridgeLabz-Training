public class Student {
    String name;
    String rollNumber;
    double marks1, marks2, marks3;

    String calculateGrades() {
        double avg = (marks1 + marks2 + marks3) / 3;
        if (avg >= 75) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        }
        return "D";
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + marks1);
        System.out.println("Mark2: " + marks2);
        System.out.println("Mark3: " + marks3);
        System.out.println("Grade " + calculateGrades());
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Thamarai";
        student1.rollNumber = "ECE001";
        student1.marks1 = 80.0;
        student1.marks2 = 70.0;
        student1.marks3 = 75.0;
        student1.displayDetails();
        System.out.println();
        
        Student student2 = new Student();
        student2.name = "Kannan";
        student2.rollNumber = "CSC002";
        student2.marks1 = 60.0;
        student2.marks2 = 65.0;
        student2.marks3 = 50.0;
        student2.displayDetails();
    }
}
