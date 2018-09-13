package ui;

import models.*;
import utilities.GenderType;

public class Main
{
    public static void main(String[] args){

        BookCatalog bookCatalog = new BookCatalog();

        Book book1 = new Book(1, "An introduction to Java Test", "Matt Greencroft", "12345",
                "Anytown Branch", 400);
        Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "23456", "Anytown Branch",
                200);
        DVD dvd1 = new DVD(3, "Epic Film about Java","Anytown Branch", "Stephen Spielberg",
                "99887",120);
        DVD dvd2 = new DVD(3, "Epic Film about Java","Anytown Branch", "Stephen Spielberg",
                "99887",120);

        System.out.println(dvd1.getTitle());
        book1.relocate("MyCity branch");

        bookCatalog.addBook(book1);
        bookCatalog.addBook(book2);

        UI ui = new UI();
        ui.printHeader();

        ui.printBook(book1);
        ui.printBook(book2);

        Book foundBook = bookCatalog.findBook("better");
        if (foundBook != null){
            System.out.println("We found " + foundBook.getTitle());
        }

        Customer customer = new Customer("Mr", "Michael","Smith","The High Street",
                "123456","Michael@smith.com", 12345, GenderType.MALE);

        System.out.println(customer.getExpiryDate());
        System.out.println(customer.getMailingName());

        System.out.println(customer);
        System.out.println(dvd1);

        System.out.println(dvd1.equals(dvd2));
        System.out.println(customer.equals(customer));

    }
}
