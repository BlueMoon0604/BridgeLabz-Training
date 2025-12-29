import java.util.Scanner;

public class GcdAndLcm {
    
    public static int findGreatestCommonDivisor(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);
        while (second > 0) {
            int remainder = second;
            second = first % second;
            first = remainder;
        }
        return first;
    }
    public static long findLeastCommonMultiple(int first, int second) {
        int commonDivisor = findGreatestCommonDivisor(first, second);
        return (long) Math.abs(first) / commonDivisor * Math.abs(second);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        
        System.out.println("GCD: " + findGreatestCommonDivisor(n1, n2));
        System.out.println("LCM: " + findLeastCommonMultiple(n1, n2));
        
        input.close();
    }
}
