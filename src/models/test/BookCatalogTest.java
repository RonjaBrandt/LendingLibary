package models.test;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookCatalogTest {

    private  BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1,"Learning Java","","","",0);
        bc.addBook(book1);
    }

    @Test
    public void testAddBook() {

        int initialNumber = bc.getNumberOfBooks();

        Book book = new Book(1,"","","","",0);
        bc.addBook(book);

        assertTrue(initialNumber ==bc.getNumberOfBooks()-1);
    }

    @Test
    public void testFindBook() {

       try {
            Book foundbook = bc.findBook("lEarning java");
        } catch (BookNotFoundException e) {
            fail("Book not found");
        }

    }

    @Test(expected = BookNotFoundException.class)
    public void testFindBookThatDoestExist() throws BookNotFoundException {

        Book foundbook = bc.findBook("Learning More Java");

    }

    @Test
    public void testFindBookWithExtraSpaces() {

        try {
            Book foundbook = bc.findBook(" lEarning java" );
        } catch (BookNotFoundException e) {
            fail("Book not found");
        }

    }
}