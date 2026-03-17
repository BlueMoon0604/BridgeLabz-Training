package m1Questions;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class StudentRecord{
	String studentName;
	String department;
	int quiz1;
	int quiz2;
	int quiz3;
	public StudentRecord(String studentName , String department, int quiz1 , int quiz2 , int quiz3) {
		this.studentName = studentName;
		this.department = department ;
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
	}
	public int getTotal() {
		return quiz1 + quiz2 + quiz3;
	}
	public int getQuizScore(String quizName) {
		if(quizName.equals("quiz1")) {
			return quiz1;
		}else if(quizName.equals("quiz2")) {
			return quiz2;
		}else if(quizName.equals("quiz3")) {
			return quiz3;
		}else {
			return -1;
		}
	}
}
public class QuizPerformanceSystem { 
	static List<StudentRecord> students = new ArrayList<>(); 
	public static void addRecord(String studentname , String department , int quiz1 , int quiz2 , int quiz3) {
		StudentRecord student1 = new StudentRecord(studentname , department , quiz1 , quiz2 , quiz3);
		students.add(student1);
		System.out.println("Record Added : " + student1.studentName );
	}
	public static void getTopByDepartment(String department) {
		if(students.isEmpty()) {
			System.out.println("No Records Available");
			return;
		}
		boolean deptFound = false;
		int maxTotal = -1;
		for(StudentRecord s : students) {
			if(s.department.equals(department) ) {
				deptFound = true;
				if(s.getTotal() > maxTotal) {
					maxTotal = s.getTotal();
				}
			}
		}
		if(!deptFound) {
			System.out.println("Department Not Found");
			return;
		}
		for(StudentRecord s : students) {
			if(s.department.equals(department) && s.getTotal() == maxTotal) {
				System.out.println(s.studentName + " " + s.getTotal());
			}
		}
	}
	public static void getTopByQuiz(String quizName) {
		if(students.isEmpty()) {
			System.out.println("No Records Available");
			return;
		}
		int maxscore = -1;
		for(StudentRecord s : students) {
			int score = s.getQuizScore(quizName);
			if(score > maxscore) {
				maxscore = score;
			}
		}
		for(StudentRecord s : students) {
			if(s.getQuizScore(quizName) == maxscore) {
				System.out.println(s.studentName + " " + maxscore);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the record" +(i + 1));
			String input = sc.nextLine();
			String[] parts = input.split(" ");
			if(parts[0].equals("Record")) {
				String name = parts[1];
				String dept = parts[2];
				int quiz1 = Integer.parseInt(parts[3]);
				int quiz2 = Integer.parseInt(parts[4]);
				int quiz3 = Integer.parseInt(parts[4]);
				
				addRecord(name , dept , quiz1 , quiz2 , quiz3);
			}else if(parts[0].equals("Top")) {
				String value = parts[1];
				if(value.equals("quiz1") || value.equals("quiz2") ||value.equals("quiz3")) {
					getTopByQuiz(value);
				}else {
					getTopByDepartment(value);
				}
			}
		}
		
	}

}
