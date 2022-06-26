//Author Name: Rico Applewhite

//Date:5/18/2022

//Course ID:CS-320

//Description: This creates an Contact Constructor, which stores ID, first and last name, phone number and address.	
import java.util.concurrent.atomic.AtomicLong;

public class Contact{
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress;
	private static AtomicLong idGenerator = new AtomicLong();


	
//Creates the contact Constructor
public Contact(String firstName, String lastName, String phoneNumber, String contactAddress) {
		//Generates a random contactID
		this.contactID=String.valueOf(idGenerator.getAndIncrement());
		
		//Check if FirstName is empty or has more than 10 characters.
		//If Empty input Null
		if (firstName == null||firstName.isBlank()) {
			this.firstName= "NULL";
		}
		else if(firstName.length() > 10) {
		this.firstName = firstName.substring(0, 10);
		} else {
		 this.firstName = firstName;
		}
		
		//Check if Last Name is empty or has more than 10 characters.
		//If Empty input Null
		if (lastName == null||lastName.isBlank()) {
			this.lastName= "NULL";
		}
		else if(lastName.length() > 10) {
		this.lastName = lastName.substring(0, 10);
		} else {
		 this.lastName = lastName;
		}

		
	//Check if PhoneNumber is empty or does not have exactly  10 characters
	if (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 10) {
	this.phoneNumber = "0123456789";
	} else {
	this.phoneNumber = phoneNumber;
	}
	
	//ADDRESS
	if (contactAddress == null || contactAddress.isBlank()) {
	this.contactAddress = "NULL";
	} else if(contactAddress.length() > 30) {
	this.contactAddress = contactAddress.substring(0,30);
	} else {
	this.contactAddress = contactAddress;
	}
	}
	
	
//GETTERS for Contact
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
}

	public String getAddress() {
		return contactAddress;
	}
	
// SETTERS For Contact updates
	public void setFirstName(String FirstName) {
		this.firstName= FirstName;
		if(firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
	}
		}
	
	public void setLastName(String LastName) {
		this.lastName= LastName;
		if(lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
	}
		}
	
	public void setPhoneNumber(String Phone) {
		if(Phone.length() != 10) {
			System.out.println("Invalid Phone Number!");
	}
		else {
			this.phoneNumber= Phone;
		}
		}
	
	
	public void setAddress(String Address) {
		this.contactAddress= Address;
		if(contactAddress.length() > 30) {
			this.contactAddress = contactAddress.substring(0, 30);
	}
		}
}
	