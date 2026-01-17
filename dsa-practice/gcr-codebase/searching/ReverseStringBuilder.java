package default_package;

public class ReverseStringBuilder {
    public static String reverseString(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }
    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseString(original);
        System.out.println("Original String  " + original);
        System.out.println("Reversed String " + reversed);
    }
}
