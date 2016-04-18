/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class PersonDirectory {
     private ArrayList<Person> personList;
     private CustomerDirectory customerDirectory;
     private EmployeeDirectory employeeDirectory;

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    

    
    
  
    
}
