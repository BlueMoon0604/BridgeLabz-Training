
public class PalindromeChecker {
	String text;
	
	boolean checkPalindrome() {
		String str = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int left = 0;
		int right = str.length() - 1;
		if(left < right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left ++ ;
			right -- ;
			

		}
		return true;	
	}
	void displayResult() {
		if(checkPalindrome()) {
			System.out.println("Text is palindrome");
		}else {
			System.out.println("Text is not palindrome");
		}
		 
	}
	public static void main(String[] args) {
		PalindromeChecker t1 = new PalindromeChecker();
		t1.text = "A man a plan a canal Panama ";
		t1.displayResult();
		System.out.println();
		PalindromeChecker t2 = new PalindromeChecker();
		t2.text = "Hello";
		t2.displayResult();
		System.out.println();
	}

}
