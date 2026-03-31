import java.util.Scanner;

public class LeapYear {
	
	public static void computeLeapYear(int year) {
		if(year >= 1582) {
			if(year % 4 == 0) {
				System.out.println(" It's a Leap year " );
			}else if(year % 100 != 0) {
				System.out.println("It's not a leap year");
			}else if(year % 400 ==0) {
				System.out.println(" It's a Leap year " );
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		computeLeapYear(year);
		
		
	}
}
