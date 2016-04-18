/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author jaini
 */
public class Employee extends Person {
    
 
    
    private static int count = 1;
    private String employeeId;

    public Employee() {
        
        employeeId = "E"+count;
        count++;
    }

    
    

   
    
    
}
