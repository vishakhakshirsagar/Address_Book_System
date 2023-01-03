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
            contacts.setfirstname(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastName(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the Zip Code :");
            contacts.setZip(sc.nextInt());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(sc.nextInt());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
        }

        //Method to Show the Contact Details
        public void displayContact() {
            System.out.println("Contact Details -");
            System.out.println("First Name : "+contacts.getFirstName());
            System.out.println("Last Name : "+contacts.getLastName());
            System.out.println("Address : "+contacts.getAddress());
            System.out.println("City : "+contacts.getCity());
            System.out.println("State : "+contacts.getState());
            System.out.println("Zip Code : "+contacts.getZip());
            System.out.println("Phone Number : "+contacts.getPhoneNumber());
            System.out.println("EMail ID : "+contacts.getEmail());
        }
    }
    }