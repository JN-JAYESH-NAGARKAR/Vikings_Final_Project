/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.FoodDonation;
import Business.Enterprise.FoodReceiver;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.PartyOrganizerOrganizatioin;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public int countNumberOfCerfiedRestaurant(){
        int count = 0;
        for(Enterprise enterprise : this.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodDonation){
                
                count = count + ((FoodDonation) enterprise).countNumberOfCertifiedRestaurant();
                
                
            }
        }
        return count;
    }
    public int countNumberOfCerfiedPartyOrganizers(){
        int count = 0;
        for(Enterprise enterprise : this.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodDonation){
                
                count = count + ((FoodDonation) enterprise).countNumberOfCertifiedPartyOrganizer();
                
                
            }
        }
        return count;
    }
    public int countNumberOfCerfiedIndividualDonors(){
        int count = 0;
        for(Enterprise enterprise : this.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodDonation){
                
                count = count + ((FoodDonation) enterprise).countNumberOfCertifiedIndividualDonors();
                
                
            }
        }
        return count;
    }
    //      *****************************count food requests ***********************************************
    public int countNumberOfIndividualReceiverFoodRequests(){
        int count = 0;
        for(Enterprise enterprise : this.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodReceiver){
                count = count + ((FoodReceiver)enterprise).countNumberOfIndividualReceiverFoodRequests();
            }
        }
        System.out.println(count + "network individual receiver food requests line number82 ");
        return count;
    }
    public int countNumberOrphanOrganizationFoodRequests(){
        int count = 0;
        for(Enterprise enterprise : this.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodReceiver){
                count = count + ((FoodReceiver)enterprise).countNumberOrphanOrganizationFoodRequests();
            }
        }
        System.out.println(count + "network orphanage food requests line number82 ");
        
        return count;
    }
    
    public int countNumberOldAgeOrganizationFoodRequests(){
        int count = 0;
        for(Enterprise enterprise : this.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodReceiver){
                count = count + ((FoodReceiver)enterprise).countNumberOldAgeOrganizationFoodRequests();
            }
        }
        System.out.println(count + "network oldage  food requests line number82 ");
        return count;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
