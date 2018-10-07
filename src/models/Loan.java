package models;

import utilities.LoanStatus;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by Ronja on 2018-10-07.
 */
public class Loan {


    private int ID;
    private Customer customer;
    private Book book;
    private Date startDate;
    private Date dueDate;
    private Date returnDate;
    private LoanStatus status;


    public Loan(int ID, Customer customer, Book book) {
        this.ID = ID;
        this.customer = customer;
        this.book = book;
        startDate =  new Date();
        status= LoanStatus.CURRENT;

        GregorianCalendar gCal = new GregorianCalendar();
        gCal.add(GregorianCalendar.DAY_OF_MONTH,14);
        this.dueDate = gCal.getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan)) return false;
        Loan loan = (Loan) o;
        return ID == loan.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Loan{ID=" + ID + ", customer=" + customer + ", book=" + book + '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public LoanStatus getStatus(){
        return status;
    }

    public void endLoan(){
        returnDate = new Date();
        status = LoanStatus.HISTORIC;
    }


}
