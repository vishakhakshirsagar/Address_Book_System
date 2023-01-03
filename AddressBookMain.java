package AddressBookSystem;

public class AddressBookMain {
        public static void main(String[] args) {
            //Welcome message for Users
            System.out.println("-------Welcome to Address Book System---------");

            //Variable for user Choice
            int choice;

            //AddressBook Object for Contact
            AddressBook addressBook = new AddressBook();

            do {
                System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" +
                        "\n4. Display Contact\n5. Exit");
                System.out.println("Enter Choice: ");
                choice = addressBook.sc.nextInt();

                switch (choice) {
                    case 1:
                        addressBook.addNewContact();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        addressBook.displayContact();
                        break;
                    case 5:
                        System.out.println("Thank You for Using Address Book.");
                        break;
                    default:
                        System.out.println("Please Select between 1 to 5 only.");
                        break;
                }
            } while (choice != 5);

        }
    }