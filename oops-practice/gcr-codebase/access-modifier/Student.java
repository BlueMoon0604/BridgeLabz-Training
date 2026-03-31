class Student {
    public String rollNumber;    
    protected String name;      
    private double cgpa;          

    public Student(String rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
class PostgraduateStudent extends Student {

    private String specialization;
    public PostgraduateStudent(String rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCgpa()); 
    }

    public static void main(String[] args) {
        Student student = new Student("CSE101", "Ritika", 8.5);
        student.displayStudentDetails();
        System.out.println("------------------");
        student.setCgpa(8.9);
        System.out.println("Updated CGPA: " + student.getCgpa());

        System.out.println("==================");
        PostgraduateStudent pgStudent =
                new PostgraduateStudent("MCS201", "Rohan", 9.1, "Data Science");
        pgStudent.displayPostgraduateDetails();
    }
}
