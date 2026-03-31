package studentGrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStudents {
	public static Map<String, List<String>> groupStudentsByGrades(List<Student> students){
		return students.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName,Collectors.toList())));
	}

}
