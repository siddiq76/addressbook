package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

private Contact[] newcontact;

public void addContact(Contact c) {
		newcontact[] = c;
		numcontact++;
}
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
if (choice == 1) 
{
			
	if (AddressBook.numContacts() < 10) {
		    
	
	System.out.println("Enter your contact\'s id:");
	int id  = stdin.next();
	System.out.println("Enter their fname.");
	String fname = stdin.nextInt();
	System.out.println("Enter their lname.");
	String lname = stdin.nextInt();
	System.out.println("Enter the city.");
	String city = stdin.nextInt();
	System.out.println("Enter the state.");
	String state = stdin.nextInt();
	System.out.println("Enter the email.");
	String email = stdin.nextInt();
	System.out.println("Enter the monbno.");
	String mobno = stdin.nextInt();
	System.out.println("Enter the zip.");
	int zip = stdin.nextInt();
	
	AdressBook.addContact(new Contact(id,fname,lname,city,state,email,mobno,zip));
	System.out.println("Contact added succefully.");
	    	}
	    	
    }
  }

}