package models.test;

import models.Book;
import models.Customer;
import models.Loan;
import org.junit.Test;
import utilities.GenderType;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class LoanTest {

    @Test
    public void testDueDate(){

        Book book = new Book(0,"","","","",0);
        Customer customer = new Customer("","","","","","",0, GenderType.MALE);

        Loan loan = new Loan(0,customer,book);

        GregorianCalendar gcEcpected = new GregorianCalendar();
        gcEcpected.add(GregorianCalendar.DAY_OF_MONTH, 14);

        GregorianCalendar gcActual = new GregorianCalendar();
        gcActual.setTime(loan.getDueDate());

        assertEquals("Checking Year",gcEcpected.get(GregorianCalendar.YEAR), gcActual.get(GregorianCalendar.YEAR));
        assertEquals("Checking Month",gcEcpected.get(GregorianCalendar.MONTH), gcActual.get(GregorianCalendar.MONTH));
        assertEquals("Checking Day",gcEcpected.get(GregorianCalendar.DAY_OF_MONTH), gcActual.get(GregorianCalendar.DAY_OF_MONTH));


    }
}