/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.ProductManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class ProductOrganization extends Organization {
    public ProductOrganization() {
        super(Organization.Type.Product.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProductManagerRole());
        return roles;
    }
    
}
