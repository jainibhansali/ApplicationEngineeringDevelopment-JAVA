/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Person.Person;

/**
 *
 * @author jaini
 */
public class Customer extends Person {
    private String customerId;
    private static int count=1;
   // private double money=0 ;
   // private CustomerAccount customerAccount;
    private CustomerAccountDirectory customerAccountDirectory;
    //private CustomerLoan customerLoan;
    private CustomerLoanDirectory customerLoanDirectory;
    private CustomerMortgageDirectory customerMortgageDirectory;
    
    
    public Customer()
    {
        customerId="C"+count;
        count++;
        //customerAccount=new CustomerAccount();
       customerAccountDirectory=new CustomerAccountDirectory(); 
       customerLoanDirectory=new CustomerLoanDirectory();
       customerMortgageDirectory=new CustomerMortgageDirectory();
        
        
        
    }

        public CustomerAccountDirectory getCustomerAccountDirectory() {
        return customerAccountDirectory;
    }

    public void setCustomerAccountDirectory(CustomerAccountDirectory customerAccountDirectory) {
        this.customerAccountDirectory = customerAccountDirectory;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

//    public CustomerLoan getCustomerLoan() {
//        return customerLoan;
//    }
//
//    public void setCustomerLoan(CustomerLoan customerLoan) {
//        this.customerLoan = customerLoan;
//    }

    public CustomerLoanDirectory getCustomerLoanDirectory() {
        return customerLoanDirectory;
    }

    public void setCustomerLoanDirectory(CustomerLoanDirectory customerLoanDirectory) {
        this.customerLoanDirectory = customerLoanDirectory;
    }

    public CustomerMortgageDirectory getCustomerMortgageDirectory() {
        return customerMortgageDirectory;
    }

    public void setCustomerMortgageDirectory(CustomerMortgageDirectory customerMortgageDirectory) {
        this.customerMortgageDirectory = customerMortgageDirectory;
    }
    
    
    
    
}
