
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double addition = n1 + n2;
        double subtraction = n1 - n2;
        double multiplication = n1 * n2;
        double division = n1 / n2;
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " 
            + n1 + " and " + n2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division
        );


    }
}

