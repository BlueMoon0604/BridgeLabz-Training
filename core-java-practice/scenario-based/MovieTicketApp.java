import java.util.*;
public class MovieTicketApp {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        char customers = 'y';
        while (customers == 'y' || customers == 'Y') {
            int totalBill = 0;
            System.out.println("Select Seat Type (gold/silver/platinum):");
            String seatType = scan.next();
            if (seatType.equalsIgnoreCase("platinum")) {
                totalBill += 200;
            } else if (seatType.equalsIgnoreCase("gold")) {
                totalBill += 120;
            } else if(seatType.equalsIgnoreCase("silver")){
            	totalBill += 80;
            }else {
            	System.out.println("Invalid Input");
            	continue;
            }
            System.out.println("Do you want snacks? (yes/no):");
            String snacksChoice = scan.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                totalBill += 100;
            }
            System.out.println("Total Ticket Price: ₹" + totalBill);
            customers = scan.next().charAt(0);
        }

       
	}

}