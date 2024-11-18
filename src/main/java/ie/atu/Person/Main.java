package ie.atu.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your address");
        String address = scan.nextLine();
        System.out.println("Please enter your phone");
        String phone = scan.nextLine();
        System.out.println("Please enter your customer number");
        String custNumber = scan.nextLine();
        System.out.println("Do you want to be on the mailing list?");
        boolean list = scan.hasNextBoolean();
        Customer newCust = new Customer(name, address, phone, custNumber, list);
        System.out.println("You entered " + newCust.toString());

        PreferredCustomer preferredCustomer = new PreferredCustomer();
        preferredCustomer.setName("Paul");
        preferredCustomer.setAddress("ATU");
        preferredCustomer.setPhone("091 775678");
        preferredCustomer.setCustNumber("1002");
        preferredCustomer.setMailingList(false);
        preferredCustomer.addLoyaltyPoints(700); // Accumulate points
        System.out.println(preferredCustomer);
        preferredCustomer.addLoyaltyPoints(800); // Accumulate more points
        System.out.println(preferredCustomer);
        }
    }
