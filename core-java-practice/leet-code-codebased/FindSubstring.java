import java.util.Scanner;

public class FindSubstring {
    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(h < n ){
            return -1;
        }
        for(int i = 0 ; i <= h - n ; i++){
            if(haystack.substring(i,i + n).equals(needle)){
                return i ;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();
        System.out.print("Enter needle: ");
        String needle = sc.nextLine();
        int result = strStr(haystack, needle);
        
        if(result != -1) {
        	System.out.println("Founded needle at index " + result + " in haystack");
        }else {
        	System.out.println("needle does not found in haystack");
        }
    }
    	
}