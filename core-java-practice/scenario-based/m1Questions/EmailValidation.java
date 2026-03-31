package m1Questions;

import java.util.Scanner;

public class EmailValidation {
	public static boolean isValidEmail(String email) {
		String format = "^[a-z]{3,}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com$";
		return email.matches(format);
		  
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i < N ; i++) {
			String input = sc.nextLine();
			if(isValidEmail(input)) {
				System.out.println("Access Granted");
			}else {
				System.out.println("Access Denied");
			}
		}
	}
	

}
