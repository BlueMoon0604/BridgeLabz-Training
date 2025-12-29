import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		boolean isPrime = checkPrime(num);
		if(isPrime) {
			System.out.println("Prime Number");
			
		}else {
			System.out.println("Not a Prime Number");
		}
	}
	private static boolean checkPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for(int i = 2 ; i * i <= num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
