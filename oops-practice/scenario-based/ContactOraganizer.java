import java.util.ArrayList;
import java.util.List;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
class Contact {
    private String name;
    private String phone;
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getPhone() { return phone; }
    public String getName() { return name; }
    public boolean equals(Object obj) {
        if (obj instanceof Contact) {
            return phone.equals(((Contact)obj).phone);
        }
        return false;
    }
    public int hashCode() {
        return phone.hashCode();
    }
}
public class ContactOraganizer {
    private List<Contact> contacts = new ArrayList<>();
    public void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone must be exactly 10 digits");
        }
        if (contacts.contains(new Contact("", phone))) {
            throw new InvalidPhoneNumberException("Duplicate phone number");
        }
        contacts.add(new Contact(name, phone));
    }
    public boolean deleteContact(String phone) {
        return contacts.removeIf(c -> c.getPhone().equals(phone));
    }
    public Contact searchContact(String phone) {
        for (Contact c : contacts) {
            if (c.getPhone().equals(phone)) return c;
        }
        return null;
    }
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }
    public static void main(String[] args) {
        ContactOraganizer organizer = new ContactOraganizer();
        try {
            organizer.addContact("John", "1234567890");
            organizer.addContact("Jane", "0987654321");
            organizer.addContact("Bob", "1234567890");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("All contacts:");
        for (Contact c : organizer.getAllContacts()) {
            System.out.println(c.getName() + " - " + c.getPhone());
        }
        Contact found = organizer.searchContact("1234567890");
        System.out.println("Found: " + (found != null ? found.getName() : "Not found"));
        organizer.deleteContact("1234567890");
        System.out.println("After delete - Count: " + organizer.getAllContacts().size());
    }
}

