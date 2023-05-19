package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contactPerson = new Contact();

    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contactPerson +
                '}';
    }

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Person First Name : ");
        String firstName = scanner.next();
        contactPerson.setFirstName(firstName);
        System.out.println("Enter Person Last Name : ");
        String lastName = scanner.next();
        contactPerson.setLastName(lastName);
        System.out.println("Enter Person City : ");
        String city = scanner.next();
        contactPerson.setCity(city);
        System.out.println("Enter Person State : ");
        String state = scanner.next();
        contactPerson.setState(state);
        System.out.println("Enter Person Zipcode : ");
        int zipcode = scanner.nextInt();
        contactPerson.setZip(zipcode);
        System.out.println("Enter person Phone Number : ");
        long phoneNumber = scanner.nextLong();
        contactPerson.setPhoneNumber(phoneNumber);
        System.out.println("Enter person Email ID : ");
        String email = scanner.next();
        contactPerson.setEmail(email);
    }
}