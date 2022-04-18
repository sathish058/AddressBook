package com.bridelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
	Contacts c;
	Scanner sc = new Scanner(System.in);
	private String lastName;
	
	public void addContact() {
		System.out.println("Enter the First Name :");
		String firstName = sc.nextLine();
		System.out.println("Enter the Last Name :");
		String lasttName = sc.nextLine();
		System.out.println("Enter the Mobile Number:");
		String mobileNo = sc.nextLine();
		System.out.println("Enter the City:");
		String city = sc.nextLine();
		System.out.println("Enter the State:");
		String state = sc.nextLine();
		System.out.println("Enter the PinCode :");
		String pinCode = sc.nextLine();
		System.out.println("Enter the E-Mail id:");
		String eMail= sc.nextLine();
		
		c.setfirstName(firstName);
		c.setlastName(lastName);
		c.setcity(city);
		c.setstate(state);
		c.setpinCode(pinCode);
		c.seteMail(eMail);
		System.out.println(c);
	}

	}


