package default_package;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LexicalTwist {
	private static boolean isValid(String word) {
		return !word.trim().contains(" ");
	}
	private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word => ");
		String word1 = sc.next().trim();
		System.out.println("Enter the Second word => ");
		String word2 = sc.next().trim();
		
		if(!isValid(word1)) {
			System.out.println( word1 + " is an invalid word");
			return;
		}
		if(!isValid(word2)) {
			System.out.println(word2 + "is an invalid word");
			return;
		}
		String reversedword1 = new StringBuilder(word1).reverse().toString();
		if(reversedword1.equalsIgnoreCase(word2)) {
			String transform = reversedword1.toLowerCase();
			StringBuilder res = new StringBuilder();
			for(char c : transform.toCharArray()) {
				if(isVowel(c)) {
					res.append('@');
				}else {
					res.append(c);
				}
			}
			System.out.println("transformed word" + res.toString());
		}else {
			String combinedWord = word1 + word2;
			String transform2 = combinedWord.toUpperCase();
			int vowelCount = 0;
			int consonantCount = 0;
			for(char c : transform2.toCharArray()) {
				if(isVowel(c)) {
					vowelCount++;
				}else {
					consonantCount++;
				}
			}
			if(vowelCount > consonantCount) {
				LinkedHashSet<Character> set = new LinkedHashSet<>();
				for (char c : transform2.toCharArray()) {
                    if (isVowel(c)) {
                        set.add(c);
                    }
                    if (set.size() == 2) {
                    	break;
                    }
                }
                for (char c : set) {
                    System.out.print(c);
                }
				
			}else if(consonantCount > vowelCount) {
				LinkedHashSet<Character> set = new LinkedHashSet<>();
				for (char c : transform2.toCharArray()) {
                    if (Character.isLetter(c) && !isVowel(c)) {
                        set.add(c);
                    }
                    if (set.size() == 2) {
                    	break;
                    }
                }
                for (char c : set) {
                    System.out.print(c);
                }
			}else {
				System.out.println("Vowels and consonants are equal");
			}
		}
	}
}
