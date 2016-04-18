package Business.Organization;


import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.SecurityPersonnelRole;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jaini
 */
public class CyberSecurityOrganization extends Organization
{
        public CyberSecurityOrganization() {
        super(Organization.Type.CyberSecurity.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SecurityPersonnelRole());
        return roles;
    }
    
}
