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
        }
    }
