import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        double p = Math.pow(base , exponent);
        System.out.println("The result is : " + p);

    }
    
}
