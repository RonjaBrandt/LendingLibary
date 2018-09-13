package models;

import utilities.GenderType;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Customer
{
     private String title;
     private String firstName;
     private String surname;
     private String adress;
     private String phoneNumber;
     private String email;
     private int customerNumber;
     private GenderType gender;
     private boolean isValid;
     private Date expiryDate;

    public Customer(String title, String firstName, String surname, String adress, String phoneNumber, String email,
                    int customerNumber, GenderType gender){

        setName(title,firstName,surname);
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerNumber = customerNumber;
        this.gender = gender;
        this.isValid = true;

        GregorianCalendar gCal = new GregorianCalendar();
        gCal.add(GregorianCalendar.YEAR,1);
        this.expiryDate = gCal.getTime();
    }

    public String getFirstName(){
         return  firstName;
     }
    public String getSurName(){

        return surname;
     }

    private void setName(String title, String firstName, String surname){
         this.title = title;
         this.firstName = firstName;
         this.surname = surname;
    }

    public String getMailingName(){
        StringBuilder sb = new StringBuilder(title);
        sb.append(" ");
        sb.append(firstName.substring(0,1));
        sb.append(" ");
        sb.append(surname);

        return sb.toString();
     }

    public GenderType getGender(){

        return gender;
    }

    public Date getExpiryDate(){
        return expiryDate;
    }

    public String toString () {
        return getMailingName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return customerNumber == customer.customerNumber &&
                isValid == customer.isValid &&
                Objects.equals(title, customer.title) &&
                Objects.equals(getFirstName(), customer.getFirstName()) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(adress, customer.adress) &&
                Objects.equals(phoneNumber, customer.phoneNumber) &&
                Objects.equals(email, customer.email) &&
                getGender() == customer.getGender() &&
                Objects.equals(getExpiryDate(), customer.getExpiryDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, getFirstName(), surname, adress, phoneNumber, email, customerNumber, getGender(), isValid, getExpiryDate());
    }
}
