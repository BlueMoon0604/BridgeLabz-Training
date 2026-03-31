public class Course {
   
    String courseName;
    int duration;  
    double fee;
    static String instituteName = "BridgeLabz Institute";
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.printf("%s - %s (%d months) - ₹%.2f%n", 
                         instituteName, courseName, duration, fee);
    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course javaCourse = new Course("Core Java", 3, 45000.0);
        Course webCourse = new Course("MERN Stack", 6, 80000.0);
        Course dsCourse = new Course("Data Structures", 4, 120000.0);
        
        System.out.println("Before updating institute name:");
        javaCourse.displayCourseDetails();
        webCourse.displayCourseDetails();
        System.out.println();
        Course.updateInstituteName("TechAcademy");
        System.out.println("After updating institute name:");
        javaCourse.displayCourseDetails();
        dsCourse.displayCourseDetails();
        System.out.println();
        webCourse.displayCourseDetails();
    }
}
