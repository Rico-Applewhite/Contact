//Author Name: Rico Applewhite

//Date:5/21/2022

//Course ID:

//Description: This codes adds, deletes and update information in the code, by search through the
//Array for specific ContactID.
import java.util.ArrayList;

public class ContactService {
// ArrayList of contacts to hold the list of contacts
ArrayList<Contact> contactList = new ArrayList<Contact>();

public void displayContactList() {
for(int counter = 0; counter < contactList.size(); counter++) {
System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
System.out.println("\t Phone Number: " + contactList.get(counter).getPhoneNumber());
System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
}
}

//Adds a new contact using the Contact constructor, then assign the new contact to the list.

public void addContact(String firstName, String lastName, String number, String address) {
//Create the new contact
Contact contact = new Contact(firstName, lastName, number, address);
contactList.add(contact);
}


//Search the ArrayList for the ContactID and Delete the contact.
public void deleteContact(String contactID) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactID)) {
			contactList.remove(i);
		}
	}
}
// The Following Code Search the Array list for the ContactID and updates it depending on what information is 
//being updated.
public void updateFirstName(String firstName, String contactID) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactID)) {
			i.setFirstName(firstName);
		}
	}
}

public void updateLastName(String lastName, String contactID) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactID)) {
			i.setLastName(lastName);
		}
	}
}

public void updatePhoneNumber(String phoneNumber, String contactID) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactID)) {
			i.setPhoneNumber(phoneNumber);
		}
	}
}

public void updateAddress(String Address, String contactID) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactID)) {
			i.setAddress(Address);
		}
	}
}



// Code below is for Testing Purposes only. Trouble getting my assertEquals to work during test
public  String getContactFirstName(String contactId) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactId)) {
			String Firstname = i.getFirstName();
			return Firstname;
			}
}
	return "";
}

public  String getContactLastName(String contactId) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactId)) {
			String Lastname = i.getLastName();
			return Lastname;
			}
}
	return "";
}

public  String getContactNumber(String contactId) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactId)) {
			String Number = i.getPhoneNumber();
			return Number;
			}
}
	return "";
}

public  String getContactAddress(String contactId) {
	for (Contact i: contactList) {
		if (i.getContactID().equalsIgnoreCase(contactId)) {
			String Address = i.getAddress();
			return Address;
			}
}
	return "";
}
	public static void main(String[] args) {
	}
}

