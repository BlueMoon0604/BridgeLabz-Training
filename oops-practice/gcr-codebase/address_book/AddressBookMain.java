package address_book;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program");
		Scanner sc = new Scanner(System.in);
		
		AddressBookSystem  system = new AddressBookSystem();
		while(true) {
			System.out.println("1 => Create Contacts in Address Book");
			System.out.println("2 => Add new contact to Address Book");
			System.out.println("3 => Edit existing contact in Address Book");
			System.out.println("4 => Delete contact in Address Book");
			System.out.println("5 => Adding multiple Contacts in Address Book");
			System.out.println("6 => Adding multiple address book in system ");
			System.out.println("7 => Search Person by name");
			System.out.println("8 => Search person by city or state");
			System.out.println("9 => View person by city or state");
			System.out.println("10 => Count persons by city or state");
			System.out.println("Choose your option ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1 : 
				system.createAddressBook(sc);
			break;
			
			case 2 : 
				system.addSingleContact(sc);
			break;
			
			case 3 : 
				system.editContact(sc);
			break;
			
			case 4 : 
				system.deleteContact(sc);
			break;
			
			case 5 : 
				system.addMultipleContacts(sc);
			break;
			
			case 6 : 
				system.addAddressBook(sc);
			break;
			
			case 7 : 
				system.searchPersonByName(sc);
			break;
			
			case 8 : 
				system.searchPersonByCityOrState(sc);
			break;
			
			case 9 : 
				system.viewPersonByCityOrState(sc);
			break;
			
			case 10 : 
				system.countPersonByCityOrState(sc);
			break;
			
			case 0 :
				System.out.println("Thank You For Using Address Book");
				System.exit(0);
				
            default :
            	System.out.println("Invalid Option");
            	
			}
			
		}
		
	}

}
