public class Pens {
    public static void main(String[] args) {
        int n = 14;
        int people = 3;
        int remainder = n % people ;
        int quantity = ( n / people ) ;
        System.out.println("The Pen Per Student is " + quantity + " and The Remaining pen not distributed is " + remainder);

    }
    
}
