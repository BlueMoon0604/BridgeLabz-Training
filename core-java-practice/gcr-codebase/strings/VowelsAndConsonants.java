import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		int vowels = 0 , consonants = 0 ;
		for(char c : s.toCharArray()){
			if(c >= 'a' & c <= 'z') {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}

}
