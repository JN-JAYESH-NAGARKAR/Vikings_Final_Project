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
import ui.RestaurantManagerRole.RestaurantManagerWorkAreaJPanel;

/**
 *
 * @author acer
 */
public class RestaurantManagerRole extends Role {
    @Override      //update return statement   --jayesh
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        System.out.println(enterprise.getName());
        return new RestaurantManagerWorkAreaJPanel(userProcessContainer, account, organization,enterprise, business);
    }
}
