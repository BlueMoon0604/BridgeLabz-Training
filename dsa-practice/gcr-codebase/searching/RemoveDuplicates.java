package default_package;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String original = "cherry is berry";
        String unique = removeDuplicates(original);
        System.out.println("Original String" + original);
        System.out.println("Unique String " + unique);
    }
}
