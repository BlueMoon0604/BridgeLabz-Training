
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double totalInches = h / 2.54;       
        int feet = (int)(totalInches / 12);         
        int inches = (int)(totalInches % 12);       
        System.out.println("Your Height in cm is " + h + " while in feet is " + feet + " and inches is " + inches );



    }
    
}
