/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CyberSecurityOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Create_Loan_Mortgage_Soc_WorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import userinterface.SecurityPersonnelRole.SocPersonnelWorkAreaJPanel;

/**
 *
 * @author jaini
 */
public class SecurityPersonnelRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SocPersonnelWorkAreaJPanel(userProcessContainer,enterprise,organization, business,account);
    }
}
