/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.IndividualReceiverOrganization;
import Business.Organization.OldAgeOrganization;
import Business.Organization.Organization;
import Business.Organization.OrphanageOrganization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Role.Role;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodReceiver extends Enterprise {
    public FoodReceiver(String name){
        super(name,Enterprise.EnterpriseType.FoodReceiver);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public int countNumberOfIndividualReceiverFoodRequests(){
        int count = 0;
        for(Organization organization : this.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof IndividualReceiverOrganization){
                IndividualReceiverOrganization org = (IndividualReceiverOrganization)organization;
                for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                    count++;
                }
            }
        }
        
        return count;
        
    }
    public int countNumberOrphanOrganizationFoodRequests(){
        int count = 0;
        for(Organization organization : this.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof OrphanageOrganization){
                OrphanageOrganization org = (OrphanageOrganization)organization;
                for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                    count++;
                }
            }
        }
        return count; 
    }
    public int countNumberOldAgeOrganizationFoodRequests(){
        int count = 0;
        for(Organization organization : this.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof OldAgeOrganization){
                OldAgeOrganization org = (OldAgeOrganization)organization;
                for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                    count++;
                }
            }
        }
        
        return count;
        
    }
    
}
