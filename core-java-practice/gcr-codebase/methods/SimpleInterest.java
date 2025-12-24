import java.util.Scanner;

public class SimpleInterest {
	
	public static void calculateSimpleInterest(float rate, int time, int principal) {
		double si = (principal * rate * time )/ 100;
		System.out.println("The Simple Interest is " + si + " for Principal " +principal+", Rate of Interest " + rate + " and Time " + time );
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal");
		int principal = sc.nextInt();
		System.out.println("Enter the rate");
		float rate = sc.nextFloat();
		System.out.println("Enter the time");
		int time = sc.nextInt();
		calculateSimpleInterest(rate , time, principal);
		
	}

}
