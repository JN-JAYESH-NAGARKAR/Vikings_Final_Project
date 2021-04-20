/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.FoodDonationAdminRole.FoodDonationAdminWorkAreaJPanel;
import ui.FoodReceiverEnterpriseAdmineRole.FoodReceiverAdminWorkAreaJPanel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class ReceiverEnterpriseAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new FoodReceiverAdminWorkAreaJPanel(userProcessContainer, enterprise,business);
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.FoodReceiverEnterpriseAdmin.getValue());
    }
}
