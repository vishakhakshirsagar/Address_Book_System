package AddressBookSystem;

import java.util.Scanner;

public class Contacts {
    private String firstname,lastname, email;
    private long phoneno;
    private String city, state;
    private long zipcode;
    static String Firstname;
    static String Lastname;
    static String Address;
    static String City;
    static String State;
    static long Zipcode;
    static long Phone_no;
    static String Email;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public long getZipcode() {
        return Zipcode;
    }
    public void setZipcode(long zipcode) {
        Zipcode = zipcode;
    }
    public long getPhoneno() {
        return Phone_no;
    }

    public void setPhoneno(long phoneno) {
        Phone_no = (int) phoneno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public static void main(String[] args) {
        System.out.println("Enter First name :");
        Scanner N = new Scanner(System.in);
        Firstname = N.nextLine();

        System.out.println("Enter Last name :");
        Scanner L = new Scanner(System.in);
        Lastname = L.nextLine();

        System.out.println("Enter Address :");
        Scanner A = new Scanner(System.in);
        Address = A.nextLine();

        System.out.println("Enter City :");
        Scanner C = new Scanner(System.in);
        City = C.nextLine();

        System.out.println("Enter State :");
        Scanner s = new Scanner(System.in);
        State = s.nextLine();

        System.out.println("Enter Zipcode :");
        Scanner Z = new Scanner(System.in);
        Zipcode = Z.nextInt();

        System.out.println("Enter Phone no :");
        Scanner P = new Scanner(System.in);
        Phone_no = (int) P.nextLong();

        System.out.println("Enter Email :");
        Scanner E = new Scanner(System.in);
        Email = E.nextLine();
    }
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + Firstname + '\'' +
                ", lastName='" + Lastname + '\'' +
                ", email='" + Email + '\'' +
                ", phoneNumber=" + Phone_no +
                ", city='" + City + '\'' +
                ", state='" + State + '\'' +
                ", zip=" + Zipcode +
                '}';
    }
}