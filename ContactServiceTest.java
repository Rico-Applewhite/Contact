//Author Name: Rico Applewhite

//Date:5/21/2022

//Course ID:CS-320

//Description: Using JUnit to test the Add,Delete and Update function of ContactService.

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

// The Following tests the Update function in the following order: First Name, Last Name,
//	Phone Number and Address.The Add function is also used in all of these.
@Test
@DisplayName("Test to Update First Name.")
@Order(1)
void testUpdateFirstName() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateFirstName("Sven", "0");
service.displayContactList();
assertEquals("Sven", service.getContactFirstName("0"), "First name was not updated.");
}

@Test
@DisplayName("Test to Update Last Name.")
@Order(2)
void testUpdateLastName() {
ContactService service = new ContactService();
service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
service.updateLastName("Blue", "1");
service.displayContactList();
assertEquals("Blue", service.getContactLastName("1"), "First name was not updated.");
}

@Test
@DisplayName("Test to Update PhoneNumber.")
@Order(3)
void testUpdatePhoneNumber() {
ContactService service = new ContactService();
service.addContact("Dr.", "Red", "2015008000", "123 Lollypop Lane");
service.updatePhoneNumber("2518880547", "2");
service.displayContactList();
assertEquals("2518880547", service.getContactNumber("2"), "Number was not updated.");
}

@Test
@DisplayName("Test to Update Address.")
@Order(4)
void testUpdateAddress() {
ContactService service = new ContactService();
service.addContact("Dr.", "Purple", "5555551111", "123 Lollypop Lane");
service.updateAddress("201 Chocole road", "3");
service.displayContactList();
assertEquals("201 Chocole road", service.getContactAddress("3"), "Address not updated.");
}
// This Test the Delete function, three contacts are created and the second one is deleted.
@Test
@DisplayName("Test to Delete")
@Order(5)
void testDeleteContact() {
ContactService service = new ContactService();
service.addContact("Mr.", "Freeze", "5555253111", "123 Cold Ave");
service.addContact("Dr.", "Cotton", "5555551111", "123 Lollypop Lane");
service.addContact("Ms.", "Dice", "5555821111", "123 Monopoly Way");
service.deleteContact("5");
service.displayContactList();
assertNotEquals("Dr.",service.getContactFirstName("5"), "First name was not updated.");
}
}
