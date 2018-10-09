package models.test;

import models.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookEquals(){

        Book book1 = new Book(0,"","","","",0);
        Book book2 = new Book(0,"","","","",0);


        assertTrue(book1.equals(book2));
    }

    @Test
    public void testBookNotEquals(){
        Book book1 = new Book(0,"","","","",0);
        Book book2 = new Book(1,"","","","",0);


        assertFalse(book1.equals(book2));
    }

}