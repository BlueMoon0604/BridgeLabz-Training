import java.util.Scanner;

public class CheckNumber {
	public static void numberType(int n) {
		if(n > 0) {
			System.out.println("positive Number");
		}else if(n == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Negative Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		numberType(n);
		
	}

}
