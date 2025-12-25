import java.util.Scanner;

public class ToogleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }

        System.out.println("Toggled string: " + result);
        sc.close();
	}

}
