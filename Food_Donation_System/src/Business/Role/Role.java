/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Systemadmin("System Admin"),
        FoodDonationEnterpriseAdmin("Food Donation Enterprise Admin"),
        FoodSafetyEnterpriseAdmin("Food Safety Enterprise Admin"),
        FoodDeliveryEnterpriseAdmin("Food Delivery Enterprise Admin"),
        FoodReceiverEnterpriseAdmin("Food Receiver Enterprise Admin"),
        RestaurantAdminRole("Restaurant Admin"),
        PartyOrganizerAdminRole("Party Organizer Admin"),
        IndividualDonorRole("Individual Donor"),
        FoodInspector("Food Inspector"),
        Driver("Driver"),
        OrphanageAdmin("Orphanage"),
        OldAgeAdmin("OldAge"),
        IndividualReceiverAdmin("Individual Receiver");
        
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}