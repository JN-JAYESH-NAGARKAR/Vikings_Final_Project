/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.Organization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Organization.RestaurantOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodDonation extends Enterprise{
    public FoodDonation(String name){
        super(name,Enterprise.EnterpriseType.FoodDonation);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    public int countNumberOfCertifiedRestaurant(){
        int count = 0;
        for(Organization organization : this.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof RestaurantOrganization){
                RestaurantOrganization org = (RestaurantOrganization)organization;
                if(org.getIfCertified().equals("Certified")) count++;
            }
        }
        
        return count;
        
    }
    public int countNumberOfCertifiedPartyOrganizer(){
        int count = 0;
        for(Organization organization : this.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof PartyOrganizerOrganizatioin){
                PartyOrganizerOrganizatioin org = (PartyOrganizerOrganizatioin)organization;
                if(org.getIfCertified().equals("Certified")) count++;
            }
        }
        
        return count;
        
    }
    public int countNumberOfCertifiedIndividualDonors(){
        int count = 0;
        for(Organization organization : this.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof IndividualFoodDonorOrganization){
                IndividualFoodDonorOrganization org = (IndividualFoodDonorOrganization)organization;
                if(org.getIfCertified().equals("Certified")) count++;
            }
        }
        
        return count;
        
    }
}
