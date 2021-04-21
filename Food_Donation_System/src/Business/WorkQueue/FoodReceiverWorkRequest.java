/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodReceiverWorkRequest extends WorkRequest{
    
    private String no_of_servings;
    private String contact_number;
    private String email_id;
    private String donor_organization_name;
    private UserAccount deliveryman;
    private Type requestingOrganizationType;
    private String requestingOrganiztionName;
    private String receivingOrganiztionName;
    private Type receivingOrganiztionType;
    private int id = 10000;
    private static int counter = 10000;
    
    public FoodReceiverWorkRequest(){
        id = counter++;
        
    }
    
    public  String getId(){
        return "fdr"+id;
    }

    public String getNo_of_servings() {
        return no_of_servings;
    }

    public void setNo_of_servings(String no_of_servings) {
        this.no_of_servings = no_of_servings;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getDonor_organization_name() {
        return donor_organization_name;
    }

    public void setDonor_organization_name(String donor_organization_name) {
        this.donor_organization_name = donor_organization_name;
    }

    public String getReceivingOrganiztionName() {
        return receivingOrganiztionName;
    }

    public void setReceivingOrganiztionName(String receivingOrganiztionName) {
        this.receivingOrganiztionName = receivingOrganiztionName;
    }

    public Type getReceivingOrganiztionType() {
        return receivingOrganiztionType;
    }

    public void setReceivingOrganiztionType(Type receivingOrganiztionType) {
        this.receivingOrganiztionType = receivingOrganiztionType;
    }


  
    
    public void setDeliveryMan(UserAccount account){
        this.deliveryman = account;
    }
   
    public UserAccount getDeliveryMan(){
        return this.deliveryman;
    }

    public Type getRequestingOrganizationType() {
        return requestingOrganizationType;
    }

    public void setRequestingOrganizationType(Type requestingOrganizationType) {
        this.requestingOrganizationType = requestingOrganizationType;
    }

    public String getRequestingOrganiztionName() {
        return requestingOrganiztionName;
    }

    public void setRequestingOrganiztionName(String requestingOrganiztionName) {
        this.requestingOrganiztionName = requestingOrganiztionName;
    }
    
    

    @Override
    public String toString() {
        return getId();
    }
    
    
    
}
