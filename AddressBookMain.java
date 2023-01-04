package AddressBookSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
        public static AddressBook addressBook;
        static Scanner sc = new Scanner(System.in);
        static Map<String, AddressBook> addressBookDirectory = new HashMap<String, AddressBook>();

        public static void main(String[] args) {
            System.out.println("Welcome To Address Book Managment System");
            System.out.println();
            System.out.println("Operation successful.");

            boolean moreChanges = true;
            do {
                System.out.println("\nChoose the operation on the Directory you want to perform");
                System.out.println("=============================================================");
                System.out.println(
                        "1.Add an Address Book\n2.Edit Existing Address Book\n3.Display Address book Directory\n4.Search Person By Regionn\n5.Exit Address book System");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        addAddressBook();
                        break;
                    case 2:
                        editAddressBook();

                        break;
                    case 3:
                        displayDirectoryContents();
                        break;
                    case 4:
                        System.out.println("Enter \n1.Search By City\n2.Search By State");
                        int searChoice = sc.nextInt();
                        if (searChoice == 1)
                            searchByCity();
                        else
                            searchByState();
                        break;
                    default:
                        moreChanges = false;
                        System.out.println("Exiting Address Book Directory !");
                }

            } while (moreChanges);

        }

        /*
         * Adding new address book to by checking existing book is available or not
         */
        public static void addAddressBook() {
            AddressBook addressBook = new AddressBook();
            System.out.println("Enter the name of the Address Book you want to add");
            String bookNameToAdd = sc.next();

            if (addressBookDirectory.containsKey(bookNameToAdd)) {
                addressBook = addressBookDirectory.get(bookNameToAdd);
                addressBook.displayMenu();
            } else {
                addressBook.setAddressBookName(bookNameToAdd);
                addressBookDirectory.put(bookNameToAdd, addressBook);
                System.out.println("Address book added successfully.");
                addressBook.displayMenu();
            }
        }

        /*
         * in this method.. calling existing address book and editing them.
         */
        public static void editAddressBook() {

            System.out.println("Enter the Name of the Address Book which you want to edit:");
            String addressBookToEdit = sc.next();

            if (addressBookDirectory.containsKey(addressBookToEdit)) {
                addressBook = addressBookDirectory.get(addressBookToEdit);
                addressBook.displayMenu();
            } else {
                System.out.println("Book Does Not Exist");
            }
        }

        /*
         * search person by city name
         */
        public static void searchByCity() {

            System.out.println("Enter the name of the City where the Person resides : ");
            String cityName = sc.next();
            System.out.println("Enter the name of the Person : ");
            String personName = sc.next();

            for (AddressBook addressBook : addressBookDirectory.values()) {
                ArrayList<Contacts> contactList = addressBook.getContact();
                contactList.stream()
                        .filter(person -> person.getFirstname().equals(personName)
                                && person.getCity().equals(cityName))
                        .forEach(person -> System.out.println(person));
            }
        }

        /*
         * searching person by his/her state name
         */
        public static void searchByState() {

            System.out.println("Enter the name of the State where the Person resides : ");
            String stateName = sc.next();
            System.out.println("Enter the name of the Person : ");
            String personName = sc.next();

            for (AddressBook addressBook : addressBookDirectory.values()) {
                ArrayList<Contacts> contactList = ((AddressBook) addressBook).getContact();
                contactList.stream()
                        .filter(person -> person.getFirstname().equals(personName)
                                && person.getState().equals(stateName))
                        .forEach(person -> System.out.println(person));
            }

        }

        /*
         * in this method displaying addressBook name
         */
        static void displayDirectoryContents() {

            System.out.println("----- Contents of the Address Book Directory-----");
            for (String eachBookName : addressBookDirectory.keySet()) {

                System.out.println(eachBookName);
            }
            System.out.println("-----------------------------------------");

        }
    }