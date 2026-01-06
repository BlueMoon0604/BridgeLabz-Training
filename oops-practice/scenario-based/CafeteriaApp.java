import java.util.Scanner;

public class CafeteriaApp {
	static String[] menu = { "0 - dosa" , "1 - red sauce pasta" , "2 - spagetti" , "3 - garlic bread" , "4 - ramen" , "5 - wonton" , "6 - dumplings" , "7 - thenduk" , "8 - soba" , "9 - bimbap"};
	static void displayMenu() {
		System.out.println("Menu");
		for(String item : menu) {
			System.out.println(item);
		}	
	}
	static String getItemByIndex(int index) {
		if(index >= 0 && index < menu.length) {
			return menu[index];
		}
		return "Invalid choice";
	}
	public static void main(String[] args) {
		displayMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item choice from (0 - 9) => ");
		int choice = sc.nextInt();
		String customerOrder = getItemByIndex(choice);
		System.out.println("Order done by customer : " + customerOrder);
		
		
	}

}
