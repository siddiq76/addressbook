package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

 public void deleteContact(String s) {
	
	int place = haveContact(s);
	if (place >= 0) {
	contact[place] = contact[numcontact-1];
	numcontact--;
	}

public static void main(String[] args) throws IOException {

	Scanner scanner = new Scanner(System.in);

while  {
	System.out.println("What is the fname of the contact you want to delete?");
	String name = stdin.next();
	Adressbook.deleteContact(name);
	}
public static void menu() {
	System.out.println("Delete a contact from your address book.");
	}