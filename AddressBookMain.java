package AddressBookSystem;

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
                        "1.Add an Address Book\n2.Edit Existing Address Book\n3.Display Address book Directory\n4.Exit Address book System");
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