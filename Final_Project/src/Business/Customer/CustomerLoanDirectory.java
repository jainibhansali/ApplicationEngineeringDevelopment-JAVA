/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class CustomerLoanDirectory {
     private ArrayList<CustomerLoan> customerLoanList;

    
    public CustomerLoanDirectory()
    {   
        customerLoanList=new ArrayList<>();
    }

    public ArrayList<CustomerLoan> getCustomerLoanList() {
        return customerLoanList;
    }

    public void setCustomerLoanList(ArrayList<CustomerLoan> customerLoanList) {
        this.customerLoanList = customerLoanList;
    }
    
    
  public CustomerLoan createCustomerLoan(Customer c)
  {
      
      CustomerLoan customerLoan=new CustomerLoan();
      c.getCustomerLoanDirectory().customerLoanList.add(customerLoan);
      return customerLoan;
  }
    
    
}
