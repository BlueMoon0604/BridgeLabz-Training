import java.util.Scanner;

public class UniversityPrice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextInt();
        float DiscountPercent = sc.nextFloat() ;
        double DiscountAmount = (fee * DiscountPercent ) / 100;
        double DiscountPrice = fee - DiscountAmount;
        System.out.println("The discount Amount is INR " + DiscountAmount + " and The final Discounted fee is INR " + DiscountPrice);
    }
    
}
