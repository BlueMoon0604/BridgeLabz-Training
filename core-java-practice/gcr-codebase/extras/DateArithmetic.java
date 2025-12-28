import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 System.out.println("Enter date");
		 String date = sc.next();
		 LocalDate dateInput  = LocalDate.parse(date , dt);
		 LocalDate result = dateInput.plusDays(7).plusMonths(2).plusYears(1).minusWeeks(2);
		 
		 System.out.println("Orignal date is : " + date );
		 System.out.println("Result date is : " + result);
		 sc.close();
		
		 
		 
	}

}
