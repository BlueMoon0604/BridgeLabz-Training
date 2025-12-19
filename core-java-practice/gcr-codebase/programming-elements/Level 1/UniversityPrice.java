public class UniversityPrice {
    public static void main(String[] args) {
        int price = 125000;
        int percent = 10;
        int discountAmount = (125000 * percent ) / 100;
        int discountPrice = price - discountAmount;
        System.out.println("The discount Amount is INR " + discountAmount + " and The final Discounted fee is INR " + discountPrice);
    }
    
}
