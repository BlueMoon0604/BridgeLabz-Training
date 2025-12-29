import java.util.Scanner;

public class RecursiveFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = getInput(sc);
		int result = calculateFactorial(num);
		displayResult(num , calculateFactorial(num));
		sc.close();
		
	}
	private static int getInput(Scanner sc) {
		System.out.println("Enter the number : ");
		return sc.nextInt(); 
	}
	private static int calculateFactorial(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		return factorial(n);
		
	}
	private static int factorial(int number) {
		if(number == 0 || number == 1) {
			return number ;
		}
		return number * factorial(number - 1);
	
	}
	private static void displayResult(int num , long factorial) {
		System.out.print(num + "!=" + factorial);
	}

}
