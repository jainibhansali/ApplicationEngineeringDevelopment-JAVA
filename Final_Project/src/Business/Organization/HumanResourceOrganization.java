/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HRmanagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class HumanResourceOrganization extends Organization {
    public HumanResourceOrganization() {
        super(Organization.Type.HumanResource.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HRmanagerRole());
        return roles;
    }
    
}
