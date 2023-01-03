package AddressBookSystem;
import java.util.Scanner;
public class AddressBook {
    //Scanner object for User Input
    Scanner sc = new Scanner(System.in);

    //Created Contacts Object for Getter and Setter Methods
    Contacts contacts = new Contacts();

    //Method to Add New Contact to AddressBook
    public void addNewContact() {
        System.out.println("Enter the Contact Details -");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZipcode(sc.nextInt());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneno(sc.nextInt());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
    }

    //Method to Show the Contact Details
    public void displayContact() {
        System.out.println("Contact Details -");
        System.out.println("First Name : " + contacts.getFirstname());
        System.out.println("Last Name : " + contacts.getLastname());
        System.out.println("Address : " + contacts.getAddress());
        System.out.println("City : " + contacts.getCity());
        System.out.println("State : " + contacts.getState());
        System.out.println("Zip Code : " + contacts.getZipcode());
        System.out.println("Phone Number : " + contacts.getPhoneno());
        System.out.println("EMail ID : " + contacts.getEmail());
    }

    //Method to Edit Contact
    public void editContact() {
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        if (!firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else {
            System.out.println("Enter the Last Name :");
            contacts.setLastname(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the Zip Code :");
            contacts.setZipcode(Integer.parseInt(sc.next()));
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneno(Integer.parseInt(sc.next()));
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
        }
    }
}