import java.util.Scanner;

public class CompareStrings {
	
	public static boolean compareWithStrings(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
			
		}
		for(int i = 0 ; i <= s1.length()-1;i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false ;
			}
		}
		return true ;
			
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string 1 ");
		String s1 = sc.nextLine();
		System.out.println("enter the string 2");
		String s2 = sc.nextLine();
		boolean charAtResult = compareWithStrings(s1, s2);
		boolean equalsResult = s1.equals(s2);
		
		System.out.println("Result from charAt method " + charAtResult);
		System.out.println("Result from boolean method " + equalsResult);
		
		if(charAtResult == equalsResult) {
			System.out.println("Both results are same ");
		}else {
			System.out.println("Results are diffrent from both methods");
		}

	}

}
