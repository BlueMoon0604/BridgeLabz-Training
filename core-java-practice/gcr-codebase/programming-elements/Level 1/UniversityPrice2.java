import java.util.Scanner;

public class UniversityPrice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextInt();
        float discountPercent = sc.nextFloat() ;
        double discountAmount = (fee * discountPercent ) / 100;
        double discountPrice = fee - discountAmount;
        System.out.println("The discount Amount is INR " + discountAmount + " and The final Discounted fee is INR " + discountPrice);
    }
    
}
