package multi_levelUniversity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
   
        Course<ExamCourse> math = new Course<>("Social Science", new ExamCourse());
        Course<AssignmentCourse> programming = new Course<>("Data Structures And Algorithms", new AssignmentCourse());
        Course<ResearchCourse> thesis = new Course<>("Research Thesis", new ResearchCourse());
        
        math.displayDetails();
        System.out.println("Grade: " + String.format("%.1f%%", math.evaluateStudent(98)) + "\n");
        
        programming.displayDetails();
        System.out.println("Grade: " + String.format("%.1f%%", programming.evaluateStudent(85)) + "\n");
        
        thesis.displayDetails();
        System.out.println("Grade: " + String.format("%.1f%%", thesis.evaluateStudent(180)) + "\n");
        
        List<CourseType> evaluations = new ArrayList<>();
        evaluations.add(new ExamCourse());
        evaluations.add(new AssignmentCourse());
        evaluations.add(new ResearchCourse());
        
        System.out.println("Supported evaluation types:");
        for (CourseType eval : evaluations) {
            System.out.println("- " + eval.getTypeName());
        }
    }
}

