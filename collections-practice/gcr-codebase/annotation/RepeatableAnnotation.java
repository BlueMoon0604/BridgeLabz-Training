package collectiontwo;


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}
class Project {
    @BugReport(description = "Login button doesn't click")
    @BugReport(description = "Dashboard is not working properly")
    public void fixIssues() {
        System.out.println("Fixing issues");
    }
}
public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        Project project = new Project();
        Method method = project.getClass().getMethod("fixIssues");

        BugReport[] bugs = method.getAnnotationsByType(BugReport.class);
        for (BugReport bug : bugs) {
            System.out.println("Bug: " + bug.description());
        }

        project.fixIssues();
    }
}
