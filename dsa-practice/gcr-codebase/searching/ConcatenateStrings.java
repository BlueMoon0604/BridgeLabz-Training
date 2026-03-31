package default_package;

public class ConcatenateStrings {
    public static String concatenate(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] words = {"Whale is very " , "big."};
        String result = concatenate(words);
        System.out.println(result);
    }
}
