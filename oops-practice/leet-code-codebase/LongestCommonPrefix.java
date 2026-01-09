import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int index = 0;
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }
    public static void main(String[] args) {
        LongestCommonPrefix sol = new LongestCommonPrefix();

        String[] strs = {"gold", "golf", "goofy"};
        String res = sol.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix is  " + res);
    }
}
