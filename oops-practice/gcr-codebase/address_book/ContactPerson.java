package address_book;

import java.util.Objects;

public class ContactPerson {
	private String firstName ;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String number;
	private String email ;
	
	public ContactPerson(String firstname, String lastName, String address, String city, String state, String zip, String number, String email ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.number = number ;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public boolean equals(Object obj) {
		if(obj  instanceof ContactPerson ) {
			return firstName.equalsIgnoreCase(((ContactPerson)obj).firstName);			
		}
		return false;
	}
	public int hashCode() {
		return firstName.toCharArray().hashCode();
	}
	public String display() {
		return "First Name" + firstName + "Last Name" + lastName + "=>" + city + "," + state +"," + number;
	}

}
