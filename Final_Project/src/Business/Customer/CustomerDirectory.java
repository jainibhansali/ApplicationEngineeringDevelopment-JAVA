/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jaini
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    
    public CustomerDirectory()
    {   
        customerList=new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    
    
    public Customer createCustomer(String name){
      // ,int ssn,long phoneNumber,String address,int zip
        Customer customer=new Customer();
        customer.setFullName(name);
//        customer.setAddress(address);
//        customer.setPhoneNumber(phoneNumber);
//        customer.setSocialSecurityNumber(ssn);
        //customer.setDateOfBirth(dob);
        customerList.add(customer);
        return customer;
    }
    public void deleteCustomer(String name)
    {
       customerList.remove(name);
       
    }
    
}
