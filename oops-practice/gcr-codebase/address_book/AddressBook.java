package address_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressBook {
	private String name;
	private List<ContactPerson> contactList;
	
	public AddressBook(String name) {
		this.name = name;
		this.contactList = new ArrayList<>();
	}
	
	public boolean addContact(ContactPerson person) {
		if(contactList.contains(person)) {
			System.out.println("Duplicate contact not allowed");
			return false;
		}
		contactList.add(person);
		return true;
	}
	public Optional<ContactPerson> findContactByName(String firstName){
		return contactList.stream().filter(p -> p.getFirstName().equalsIgnoreCase(firstName)).findFirst();
	}
	public void deleteContact(String firstName) {
		findContactByName(firstName).ifPresentOrElse(contactList :: remove, () -> System.out.println("Person not found"));
	}
	public List<ContactPerson> getAllContacts(){
		return contactList;
	}

}
