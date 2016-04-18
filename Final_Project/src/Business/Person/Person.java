/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jaini
 */
public class Person {
    private String fullName;
    private int id;
    private long phoneNumber;
    private long socialSecurityNumber;
    private String address;
    private int zipCode;
    private Date dateOfBirth;
    private static int count = 1;
   // private SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
    
    public Person()
    {
        id=count;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
         return fullName;
    }

//    public SimpleDateFormat getS() {
//        return s;
//    }
//
//    public void setS(SimpleDateFormat s) {
//        this.s = s;
//    }
   
 
    
}
