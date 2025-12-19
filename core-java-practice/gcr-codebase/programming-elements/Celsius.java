import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cel = sc.nextInt();
        int fahrenheit = (cel * 9/5) + 32 ;
        System.out.println("Temperature in Fahrenheit is : " + Fahrenheit);
    }
    
}
