public class UniversityPrice {
    public static void main(String[] args) {
        int price = 125000;
        int percent = 10;
        int DiscountAmount = (125000 * percent ) / 100;
        int DiscountPrice = price - DiscountAmount;
        System.out.println("The discount Amount is INR " + DiscountAmount + " and The final Discounted fee is INR " + DiscountPrice);
    }
    
}
