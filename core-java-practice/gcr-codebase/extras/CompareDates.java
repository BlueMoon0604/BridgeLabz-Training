import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CompareDates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Enter date 1");
		LocalDate date1 = LocalDate.parse(sc.next(), dt);
		System.out.println("Enter date 2");
		LocalDate date2 = LocalDate.parse(sc.next(), dt);
		
		if(date1.isBefore(date2)) {
			System.out.println("First date is before second date");
		}else if(date1.isAfter(date2)) {
			System.out.println("First date is after second date");
		}else if(date1.isEqual(date2)) {
			System.out.println("Both dates are equal");
		}
	
		
		
	}

}
