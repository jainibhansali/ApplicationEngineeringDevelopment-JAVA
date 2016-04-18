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
public class CustomerMortgageDirectory {
    private ArrayList<CustomerMortgage> customerMorgageList;

    
    public CustomerMortgageDirectory()
    {   
        customerMorgageList=new ArrayList<>();
    }

    public ArrayList<CustomerMortgage> getCustomerMorgageList() {
        return customerMorgageList;
    }

    public void setCustomerMorgageList(ArrayList<CustomerMortgage> customerMorgageList) {
        this.customerMorgageList = customerMorgageList;
    }
    
    public CustomerMortgage createCustomerMortgage(Customer c)
  {
      
      CustomerMortgage customerMortgage=new CustomerMortgage();
      c.getCustomerMortgageDirectory().getCustomerMorgageList().add(customerMortgage);
      return customerMortgage;
  } 
}
