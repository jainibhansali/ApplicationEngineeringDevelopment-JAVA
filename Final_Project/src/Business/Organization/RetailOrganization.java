/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.FinancialAdvisorRole;
import Business.Role.RetailManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class RetailOrganization extends Organization {
    public RetailOrganization() {
        super(Organization.Type.Retail.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RetailManagerRole());
        roles.add(new FinancialAdvisorRole());
        return roles;
    }
    
    
    
}
