import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // GST Rate 
        final double gstRate = 0.18;
        while(true){
            System.out.println("Welcome to Ravi's Cafe");
            System.out.println("Enter The Coffee Type ");
            String coffeeType = sc.next().toLowerCase();
            // Type exit to quit
            if(coffeeType.equals("exit")){
                System.out.println("Thank you for visiting our cafe ! ");
                break;
            }
            // Input for quantity
            System.out.println("How many cups you want ? ");
            int quantity = sc.nextInt();
            double pricePerCup ;
            // Choose your coffee type 
            switch(coffeeType){
                case "expresso":
                    pricePerCup = 100;
                    break;
                case "latte":
                    pricePerCup = 250;
                    break;    
                case "cappucino":
                    pricePerCup = 200;
                    break;
                case "Cold Coffee":
                    pricePerCup = 80;
                    break;   
                default:
                    System.out.println("Invalid Input for Coffee");
                    continue;         
            }
            // calculating bill
            double total = pricePerCup * quantity;
            double gst = total * gstRate;
            double bill = total + gst;

            System.out.println("Bill");
            System.out.println("Coffee Ordered : " + coffeeType);
            System.out.println("Price per cup  : " + pricePerCup);
            System.out.println("Total Bill : " + bill);


        }
    }

}
