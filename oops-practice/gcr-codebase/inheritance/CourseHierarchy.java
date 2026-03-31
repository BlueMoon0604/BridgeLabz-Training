class Course {
    protected String courseName;
    protected int duration; 
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public String getCourseDetails() {
        return "Course: " + courseName + ", Duration: " + duration + " weeks";
    }
    public void displayDetails() {
        System.out.println(getCourseDetails());
    }
}
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    public String getCourseDetails() {
        return super.getCourseDetails() +  ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
    }
}
class PaidOnlineCourse extends OnlineCourse {
    protected double fee;
    protected double discount; 
    public PaidOnlineCourse(String courseName, int duration, String platform, 
                           boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public String getCourseDetails() {
        double finalFee = fee * (1 - discount / 100);
        return super.getCourseDetails() + 
               ", Fee: $" + finalFee + " (after " + discount + "% discount)";
    }
}
public class CourseHierarchy {
    public static void main(String[] args) {
        Course[] courses = {
            new Course("Machine Learning", 8),
            new OnlineCourse("OOPs ", 6, "Zoom", true),
            new PaidOnlineCourse("Gen AI", 8, "Udemy", true, 20000.0, 20.0)
        };
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
