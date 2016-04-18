/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class CustomerAccountDirectory {
    
    
     private ArrayList<CustomerAccount> customerAccountList;

    
    public CustomerAccountDirectory()
    {   
        customerAccountList=new ArrayList<>();
       
    }
    
    
      public void generateDebitDetails(CustomerAccount customerAccount)
      {   boolean status=true;
      
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String date = "03/12/1991";
        java.util.Date utilDate = null;
        try {
        utilDate = format.parse(date);
        } catch (ParseException e) {
      // TODO Auto-generated catch block
         e.printStackTrace();
        }
           for(int i=100;i<1000;i++)
          {
              customerAccount.setDebitCardNumber(i*100000000);
              System.out.println("debit number"+customerAccount.getDebitCardNumber());
              customerAccount.setCvv(i);
              System.out.println("debit number"+customerAccount.getCvv());
              break;    
          }
          customerAccount.setValidThrough(utilDate);
          
        
      }
      public CustomerAccount createCustomerAccount(Customer c)
      {
        CustomerAccount customerAccount=new CustomerAccount();
        c.getCustomerAccountDirectory().getCustomerAccountList().add(customerAccount);
        return customerAccount;
      }

    public ArrayList<CustomerAccount> getCustomerAccountList() {
        return customerAccountList;
    }

    public void setCustomerAccountList(ArrayList<CustomerAccount> customerAccountList) {
        this.customerAccountList = customerAccountList;
    }
}
