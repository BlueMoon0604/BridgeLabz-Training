public class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    
    private final String rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student instance.");
        }
    }
    
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            System.out.println("Grade updated to: " + newGrade);
            this.grade = newGrade;
        } else {
            System.out.println("Cannot update grade for invalid student instance.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    } 
    public static void main(String[] args) {
        displayTotalStudents();
        Student student1 = new Student("\nHemashree", "101", "A");
        student1.displayStudentDetails();
        System.out.println();
        
        Student student2 = new Student("Sharmila", "102", "B");
        student2.displayStudentDetails();
        student2.updateGrade("A");
        System.out.println();
        student2.displayStudentDetails();
    }
}
