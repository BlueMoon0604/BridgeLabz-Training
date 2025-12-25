import java.util.Scanner;

public class CheckFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int[] frequency = new int[256];
        char maxChar = ' ';
        int maxCount = 0;
        for (char c : s.toCharArray()) {
            frequency[c]++;
            if (frequency[c] > maxCount) {
                maxCount = frequency[c];
                maxChar = c;
            }
        }

        System.out.println("Most frequent character: " + maxChar);
    }
}
