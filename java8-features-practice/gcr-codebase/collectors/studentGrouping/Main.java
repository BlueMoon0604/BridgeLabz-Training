package studentGrouping;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Nova", "A"),
                new Student("Raven", "B"),
                new Student("Eric", "A"),
                new Student("Urus", "C"),
                new Student("Snail", "B")
        );
        Map<String, List<String>> groupedResult = GroupingStudents.groupStudentsByGrades(students);
        groupedResult.forEach((grade, names) -> System.out.println(grade + ":" + names));
    }
} 
