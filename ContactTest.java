//Author Name: Rico Applewhite

//Date:5/18/2022

//Course ID:CS-320

//Description: Using JUnit to test against constraints in place for the Contact Constructor
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
// First five test tests the character input for the ContactID, FirstName, LastName, Phone number
// and address.
@Test
@DisplayName("Contact ID cannot have more than 10 characters")
void testContactIDWithMoreThanTenCharacters() {
Contact contact = new Contact( "FirstName","LastName","PhoneNumbr","Address");
if(contact.getContactID().length() > 10) {
fail("Contact ID has more than 10 characters.");
}
}

@Test
@DisplayName("Contact First Name cannot have more than 10 characters")
void testContactFirstNameWithMoreThanTenCharacters() {
Contact contact = new Contact("MichealAngelo","LastName","PhoneNumbr","Address");
if(contact.getFirstName().length() > 10) {
fail("First Name has more than 10 characters.");
}
}

@Test
@DisplayName("Contact Last Name cannot have more than 10 characters")
void testContactLastNameWithMoreThanTenCharacters() {
Contact contact = new Contact("FirstName","MichealAngelo","PhoneNumbr","Address");
if(contact.getLastName().length() > 10) {
fail("Last Name has more than 10 characters.");
}
}

@Test
@DisplayName("Phone Number must have only 10 characters")
void testContactPhoneNumberWithMoreThanTenCharacters() {
Contact contact = new Contact("FirstName","LastName","90155555555","Address");
if(contact.getPhoneNumber().length() > 10) {
fail("Phone Number has less or more than 10 characters.");
}
}

@Test
@DisplayName("Address must have 30 or less characters")
void testContactAddrewssWithMoreThanThirtyCharacters() {
Contact contact = new Contact("FirstName","LastName","PhoneNumber","2004 This Address is Longer than  any other Addrees known to man");
if(contact.getAddress().length() > 30) {
fail("Address has more than 30 characters.");
}
}
//Next four test if ContactID, FirstName, LastName, phone number and address.is null

@Test
@DisplayName("Contact First Name cannot be null")
void testnullContactFirstName() {
Contact contact = new Contact(null,"LastName","PhoneNumbr","Address");
if(contact.getFirstName() == null) {
fail("First Name is null");
}
}

@Test
@DisplayName("Contact Last Name cannot be null")
void testnullContactLastName() {
Contact contact = new Contact("FirstName",null,"PhoneNumbr","Address");
if(contact.getLastName() == null) {
fail("Last Name is null");
}
}

@Test
@DisplayName("Contact Phone Number cannot be null")
void testnullContactPhoneNumber() {
Contact contact = new Contact("FirstName","LastName", null ,"Address");
if(contact.getPhoneNumber() == null) {
fail("Phone Number is null");
}
}

@Test
@DisplayName("Contact Address cannot be null")
void testnullContactAddress() {
Contact contact = new Contact("FirstName","LastName","PhoneNumbr",null);
if(contact.getAddress() == null) {
fail("Address is null");
}
}

//Next four test if ContactID, FirstName, LastName, phone number and address.is Blank

@Test
@DisplayName("Contact First Name cannot be Blank")
void testBlankContactFirstName() {
Contact contact = new Contact("","LastName","PhoneNumbr","Address");
if(contact.getFirstName() == "") {
fail("First Name is Blank");
}
}

@Test
@DisplayName("Contact Last Name cannot be Blank")
void testBlankContactLastName() {
Contact contact = new Contact("FirstName","","PhoneNumbr","Address");
if(contact.getLastName() == "") {
fail("Last Name is Blank");
}
}

@Test
@DisplayName("Contact Phone Number cannot be Blank")
void testBlankContactPhoneNumber() {
Contact contact = new Contact("FirstName","LastName", "" ,"Address");
if(contact.getPhoneNumber() == "") {
fail("Phone Number is Blank");
}
}

@Test
@DisplayName("Contact Address cannot be Blank")
void testBlankContactAddress() {
Contact contact = new Contact("FirstName","LastName","PhoneNumbr","");
if(contact.getAddress() == "") {
fail("Address is Blank");
}
}
// Test Setters
@Test
@DisplayName("Set Address must also follow requirments")
void testSetContactAddress() {
Contact contact = new Contact("FirstName","LastName","PhoneNumbr","");
contact.setAddress("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
if(contact.getAddress() == "") {
fail("Address is invalid");
}
}

@Test
@DisplayName("Set Phone Number must also follow requirments")
void testSetContactPhoneNumber() {
Contact contact = new Contact("FirstName","LastName", "" ,"Address");
contact.setPhoneNumber("1111111111111111111111111111111111111111111111111111");
if(contact.getPhoneNumber() == "") {
fail("Phone Number is invalid");
}
}

@Test
@DisplayName("Set Last Name must also follow requirments")
void testSetContactLastName() {
Contact contact = new Contact("FirstName","","PhoneNumbr","Address");
contact.setLastName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
if(contact.getLastName() == "") {
fail("Last Name is invalid");
}
}

@Test
@DisplayName("Set First must also follow requirments")
void testSetContactFirstName() {
Contact contact = new Contact("FirstName","","PhoneNumbr","Address");
contact.setLastName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
if(contact.getFirstName() == "") {
fail("First Name is invalid");
}
}
}
