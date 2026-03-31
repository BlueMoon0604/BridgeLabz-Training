import java.util.Scanner;

public class GenrateFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		printFibonacci(n);
	}
	private static void printFibonacci(int n) {
		if(n <= 0) {
			System.out.println("Enter valid input ");
			return;
		}
		int first = 0 , second = 1;
		for(int i = 0 ; i < n ; i++) {
			System.out.print(first + " ");
			int next =  first + second;
			first = second ;
			second = next ;
		}
		System.out.println();
	
			
	}

}