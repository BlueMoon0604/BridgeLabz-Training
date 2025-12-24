import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void numberSum(int n ) {
		if (n > 0) {
			int sum = 0 ;
			for(int i = 0; i <= n ; i ++) {
				sum = sum + i ;
			}
			System.out.println("The sum of n natural numbers is :" + sum);
			
		}else {
			System.out.println("invalid input");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		numberSum(n);
		
	}

}
