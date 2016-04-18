/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Customer.CustomerDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.PersonDirectory;
import static Business.Role.Role.RoleType.Customer;

/**
 *
 * @author jaini
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    //private PersonDirectory personDirectory;
    private CustomerDirectory customerDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        customerDirectory=new CustomerDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),Bank("Bank");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    

    
    
    

}
