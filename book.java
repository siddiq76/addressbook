package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean isExit = false;
    while (!isExit) {
      System.out.println("Please choose the number\n1. For creation\n2. For update\n3. For Exit\n4. Print All Books");
      int userInputForBookOperation = scanner.nextInt();
      switch (userInputForBookOperation) {
        case 1:
          Book book = new Book();
          System.out.println("Enter id");
          book.setId(scanner.nextInt());
          System.out.println("Enter fname");
          book.setFname(scanner.next());
          System.out.println("Enter lname");
          book.setLname(scanner.next());
          System.out.println("Enter city");
          book.setCity(scanner.next());
          System.out.println("Enter state");
          book.setState(scanner.next());
          System.out.println("Enter Zip Code");
          book.setZipCode(scanner.next());
          System.out.println("Enter email");
          book.setEmail(scanner.next());
          System.out.println("Enter Phone Number");
          book.setPhoneNumber(scanner.next());
          System.out.println("Adding book: "+ book.toString());
          books.add(book);
          break;
        case 2:
          System.out.println("For Updation Please provide fname for book");
          String userInputFName = scanner.next();
          Book book1 = null;
          int indexOfBook = -1;
          for (int index = 0; index < books.size(); index++) {
            if(books.get(index).getFname().equals(userInputFName)){
              book1 = books.get(index);
              indexOfBook = index;
              break;
            }
          }
          if(indexOfBook == -1) {
            System.out.println("Unable to Find book");
          }else {
            System.out.println("Enter state");
            book1.setState(scanner.next());
            System.out.println("Enter Zip Code");
            book1.setZipCode(scanner.next());
            books.remove(indexOfBook);
            books.add(indexOfBook, book1);
          }
          break;
        case 3:
          System.out.println("Thank you");
          isExit=true;
          break;
        case 4:
          System.out.println(books.toString());
          break;
      }
    }
  }

}