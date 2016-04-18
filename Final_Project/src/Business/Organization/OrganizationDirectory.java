/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author jaini
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Product.getValue())){
            organization = new ProductOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Retail.getValue())){
            organization = new RetailOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HumanResource.getValue())){
            organization = new HumanResourceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CyberSecurity.getValue())){
            organization = new CyberSecurityOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}