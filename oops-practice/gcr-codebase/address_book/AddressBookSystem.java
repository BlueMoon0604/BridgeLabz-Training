package address_book;

import java.util.*;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBookMap = new HashMap<>();
    private Map<String, List<ContactPerson>> cityMap = new HashMap<>();
    private Map<String, List<ContactPerson>> stateMap = new HashMap<>();

    public void createAddressBook(Scanner sc) {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists");
            return;
        }
        addressBookMap.put(name, new AddressBook(name));
        System.out.println("Address Book Created ");
    }
    public void addSingleContact(Scanner sc) {
        AddressBook book1 = selectAddressBook(sc);
        if (book1 == null) {
        	return;
        }
        ContactPerson person = takePersonInput(sc);
        if (book1.addContact(person)) {
            updateCityStateMap(person);
            System.out.println("Contact Added ");
        }
    }
    public void editContact(Scanner sc) {
        AddressBook book1 = selectAddressBook(sc);
        if (book1 == null) {
        	return;
        }
        System.out.print("Enter First Name to Edit");
        String name = sc.nextLine();

        book1.findContactByName(name).ifPresentOrElse(person -> {
            System.out.print("Enter New Address");
            person.setAddress(sc.nextLine());
            System.out.print("Enter New Phone");
            person.setNumber(sc.nextLine());
            System.out.println("Contact Updated");
        }, () -> System.out.println("Person Not Found"));
    }
    public void deleteContact(Scanner sc) {
        AddressBook book1 = selectAddressBook(sc);
        if (book1 == null) {
        	return;
        }
        System.out.print("Enter First Name to Delete");
        book1.deleteContact(sc.nextLine());
    }
    public void addMultipleContacts(Scanner sc) {
        AddressBook book1 = selectAddressBook(sc);
        if (book1 == null) {
        	return;
        }
        while (true) {
            ContactPerson person = takePersonInput(sc);
            if (book1.addContact(person)) {
                updateCityStateMap(person);
            }
            System.out.print("Add another contact? (yes/no): ");
            if (!sc.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
    public void addAddressBook(Scanner sc) {
        createAddressBook(sc);
    }
    public void searchPersonByName(Scanner sc) {
        System.out.print("Enter Name to Search");
        String name = sc.nextLine();
        addressBookMap.values().forEach(book -> book.findContactByName(name).ifPresent(System.out::println));
    }
    public void searchPersonByCityOrState(Scanner sc) {
        System.out.print("Enter City or State");
        String key = sc.nextLine();

        cityMap.getOrDefault(key, List.of()).forEach(System.out::println);
        stateMap.getOrDefault(key, List.of()).forEach(System.out::println);
    }
    public void viewPersonByCityOrState(Scanner sc) {
        searchPersonByCityOrState(sc);
    }
    public void countPersonByCityOrState(Scanner sc) {
        System.out.print("Enter City or State");
        String key = sc.nextLine();
        System.out.println("Count by City: " + cityMap.getOrDefault(key, List.of()).size());
        System.out.println("Count by State: " + stateMap.getOrDefault(key, List.of()).size());
    }
    private AddressBook selectAddressBook(Scanner sc) {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();
        AddressBook book1 = addressBookMap.get(name);
        if (book1 == null) {
            System.out.println("Address Book Not Found");
        }
        return book1;
    }

    private ContactPerson takePersonInput(Scanner sc) {
        System.out.print("First Name => ");
        String firstName = sc.nextLine();
        System.out.print("Last Name => ");
        String lastName = sc.nextLine();
        System.out.print("Address => ");
        String address = sc.nextLine();
        System.out.print("City => ");
        String city = sc.nextLine();
        System.out.print("State => ");
        String state = sc.nextLine();
        System.out.print("Zip => ");
        String zip = sc.nextLine();
        System.out.print("Number => ");
        String phone = sc.nextLine();
        System.out.print("Email => ");
        String email = sc.nextLine();

        return new ContactPerson(firstName, lastName, address, city, state, zip, phone, email);
    }
    private void updateCityStateMap(ContactPerson person) {
        cityMap.computeIfAbsent(person.getCity(), k -> new ArrayList<>()).add(person);
        stateMap.computeIfAbsent(person.getState(), k -> new ArrayList<>()).add(person);
    }
}

