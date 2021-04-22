/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Jayesh Nagarkar
 */
public class RestaurantRequest extends WorkRequest{
    
    private int orderId;
    private Organization.Type requestingOrganizationType;
    private Organization requestingOrganiztionName;
    private int noOfServings;
    private String address;
    private String emailId;
    private String status;
    
    
   
    
    private static int counter = 10000;
    
    public RestaurantRequest(){
        orderId = counter++;
        
    }

    public Organization.Type getRequestingOrganizationType() {
        return requestingOrganizationType;
    }

    public void setRequestingOrganizationType(Organization.Type requestingOrganizationType) {
        this.requestingOrganizationType = requestingOrganizationType;
    }

    public Organization getRequestingOrganiztionName() {
        return requestingOrganiztionName;
    }

    public void setRequestingOrganiztionName(Organization requestingOrganiztionName) {
        this.requestingOrganiztionName = requestingOrganiztionName;
    }

    public int getNoOfServings() {
        return noOfServings;
    }

    public void setNoOfServings(int noOfServings) {
        this.noOfServings = noOfServings;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
   public String getOrderID(){
       return "SFR" + orderId;
   }
    

    @Override
    public String toString() {
        return getOrderID();
    }
    
    
    
}
