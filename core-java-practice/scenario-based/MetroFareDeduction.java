import java.util.Scanner;

public class MetroFareDeduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you starting balance");
		double balance = sc.nextDouble();
		while(true) {
			if(balance < 9 ) {
				System.out.println("Please recharge your card . Balance is low ");
				break;
			}
			System.out.println("Enter distance in km ");
			double distance = sc.nextDouble();
			if(distance == -1 ) {
				System.out.println("Thank you for travelling in metro ! Please visit again");
				break;
			}else if(distance <= 0) {
				System.out.println("Invalid Distance");
				break;
			}
			double fare =
			        (distance <= 2)  ? 9  :
			        (distance <= 5)  ? 18 :
			        (distance <= 12) ? 27 :
			        (distance <= 21) ? 36 :
			        (distance <= 32) ? 45 : 54;
			if(fare > balance) {
				System.out.println("Balance is not sufficient . Please recharge your card");
				break;
			}
			balance = balance - fare ;
			System.out.println("Fare charged : " + fare);
			System.out.println("Remaining Balance : " + balance);
			System.out.println("Do you want to travel again ? Give answer in y or n ");
			char ch = sc.next().toLowerCase().charAt(0);
			if(ch == 'n') {
				System.out.println("Thank you for travelling in metro ! Please visit again");
				break;
			}
			

		}
		
	}

}
