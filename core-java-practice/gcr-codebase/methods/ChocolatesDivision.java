import java.util.Scanner;

public class ChocolatesDivision {
	public static int[] findRemainderAndQuotient(int numberOfChildren , int numberOfChocolates) {
		int remainder = numberOfChocolates  % numberOfChildren  ;
		int quotient = numberOfChocolates  / numberOfChildren ;
		int[] arr=new int[2];
		arr[0]=remainder;
		arr[1]=quotient;
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfChocolates = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		int result[]=findRemainderAndQuotient(numberOfChildren , numberOfChocolates);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}

}
