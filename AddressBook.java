package AddressBookSystem;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook {
        //Scanner object for User Input
        Scanner sc = new Scanner(System.in);
        int choice;

        ArrayList<Contacts> contactList = new ArrayList<>();

        //Method to Add New Contact to AddressBook
        public void addNewContact() {
            Contacts contacts = new Contacts();
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
            contacts.setZipcode(Integer.valueOf(sc.next()));
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneno(Integer.valueOf(sc.next()));
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
            contactList.add(contacts);
        }

        //Method to Show the Contact Details
        public void displayContact() {
            for (Contacts contact : contactList) {
                if (contact.getFirstname() == null) {
                    System.out.println("Contact Details Not Available");
                } else {
                    System.out.println("Contact Details -");
                    System.out.println("First Name : " + contact.getFirstname());
                    System.out.println("Last Name : " + contact.getLastname());
                    System.out.println("Address : " + contact.getAddress());
                    System.out.println("City : " + contact.getCity());
                    System.out.println("State : " + contact.getState());
                    System.out.println("Zip Code : " + contact.getZipcode());
                    System.out.println("Phone Number : " + contact.getPhoneno());
                    System.out.println("EMail ID : " + contact.getEmail());
                }
            }
        }

        //Method to Edit the Existing Contact
        public void editContact() {
            //Get First Name to Edit the Contact
            System.out.println("Enter the First Name : ");
            String firstName = sc.next();

            //check if the Given User with First Name
            boolean isAvailable = false;
            for (Contacts contact : contactList) {
                if (firstName.equalsIgnoreCase(contact.getFirstname())) {
                    isAvailable = true;
                    System.out.println("Enter the Last Name :");
                    contact.setLastname(sc.next());
                    System.out.println("Enter the Address :");
                    contact.setAddress(sc.next());
                    System.out.println("Enter the City :");
                    contact.setCity(sc.next());
                    System.out.println("Enter the State :");
                    contact.setState(sc.next());
                    System.out.println("Enter the Zip Code :");
                    contact.setZipcode(Integer.valueOf(sc.next()));
                    System.out.println("Enter the Phone Number :");
                    contact.setPhoneno(Integer.valueOf(sc.next()));
                    System.out.println("Enter the EMail ID :");
                    contact.setEmail(sc.next());
                    break;
                }
            }
            if (!isAvailable) {
                System.out.println("Contact Number Not Found.");
            }
        }

        //Method to Delete the Existing Contact
        public void deleteContact() {
            //Get First Name to Edit the Contact
            System.out.println("Enter the First Name : ");
            String firstName = sc.next();

            //check if the Given User with First Name
            boolean isAvailable = false;
            for (Contacts contact : contactList) {
                if (firstName.equalsIgnoreCase(contact.getFirstname())) {
                    isAvailable = true;
                    contactList.remove(contact);
                    System.out.println("Contact Deleted.");
                    break;
                }
            }
            if (!isAvailable) {
                System.out.println("Contact Number Not Found.");
            }
        }

        public void contactOptions(AddressBook addressBook) {
            //Show Menu for user to Select Operation on AddressBook
            do {
                System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
                System.out.println("1. ADD NEW CONTACT\n2. EDIT CONTACT\n3. DELETE CONTACT" +
                        "\n4. DISPLAY CONTACT\n5. EXIT");
                System.out.println("Please Select the Operation Number : ");
                choice = addressBook.sc.nextInt();

                switch (choice) {
                    case 1:
                        addressBook.addNewContact();    //Adding New Contact Details
                        break;
                    case 2:
                        addressBook.editContact();  //Edit Contact Details
                        break;
                    case 3:
                        addressBook.deleteContact();    //Delete the Contact Details
                        break;
                    case 4:
                        addressBook.displayContact();   //Show Contact Details
                        break;
                    case 5:
                        System.out.println("Thank You for Using Address Book.");
                        break;
                    default:
                        System.out.println("Please Select the Operation between 1 to 5 only.");
                        break;
                }
            } while (choice != 5);
        }
    }