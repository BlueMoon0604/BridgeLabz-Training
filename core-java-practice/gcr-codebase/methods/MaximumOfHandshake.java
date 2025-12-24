import java.util.Scanner;

public class MaximumOfHandshake {
	public static void maximumHandshake(int numberOfStudents) {
		int combination = (numberOfStudents * (numberOfStudents - 1)) / 2 ;
		System.out.println("The number of possible handshake is : " + combination);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		int numberOfStudents = sc.nextInt();
		maximumHandshake(numberOfStudents);
		
	}

}
