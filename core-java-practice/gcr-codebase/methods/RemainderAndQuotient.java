import java.util.Scanner;

public class RemainderAndQuotient {
	public static int[] findRemainderAndQuotient(int n, int divisor) {
		int remainder = n %  divisor ;
		int quotient = n / divisor ;
		int[] arr=new int[2];
		arr[0]=remainder;
		arr[1]=quotient;
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divisor = sc.nextInt();
		int result[]=findRemainderAndQuotient(n , divisor);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}

}
