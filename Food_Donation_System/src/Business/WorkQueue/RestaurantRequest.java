/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jayesh Nagarkar
 */
public class RestaurantRequest extends WorkRequest{
    
    private int orderId;
    
    private Organization.Type requestingOrganizationType; //food receiver = food requesting
    private Organization requestingOrganiztionName;
    private UserAccount requestingOrganizationUser;
    
    private Organization.Type donorOrganizationType;
    private Organization donorOrganization;
    private UserAccount donorOrganizationUser;
    
    private int noOfServings;
    private String address;
    private String emailId;
    private String status;
    
    
    private Organization deliveryOrganization;
    private UserAccount deliveryUser;
    private String pickupAddress;   
    private String deliveryAddress;
    private Date deliveryTimestamp;   //timestamp
    
    
   
    
    private static int counter = 10000;
    
    public RestaurantRequest(){
        orderId = counter++;
        
    }

    public Organization.Type getDonorOrganizationType() {
        return donorOrganizationType;
    }

    public void setDonorOrganizationType(Organization.Type donorOrganizationType) {
        this.donorOrganizationType = donorOrganizationType;
    }

    public Organization getDonorOrganization() {
        return donorOrganization;
    }

    public void setDonorOrganization(Organization donorOrganization) {
        this.donorOrganization = donorOrganization;
    }

    
    public Organization getDeliveryOrganization() {
        return deliveryOrganization;
    }

    public void setDeliveryOrganization(Organization deliveryOrganization) {
        this.deliveryOrganization = deliveryOrganization;
    }

    public UserAccount getDeliveryUser() {
        return deliveryUser;
    }

    public void setDeliveryUser(UserAccount deliveryUser) {
        this.deliveryUser = deliveryUser;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getDeliveryTimestamp() {
        return deliveryTimestamp;
    }

    public void setDeliveryTimestamp(Date deliveryTimestamp) {
        this.deliveryTimestamp = deliveryTimestamp;
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

    public UserAccount getRequestingOrganizationUser() {
        return requestingOrganizationUser;
    }

    public void setRequestingOrganizationUser(UserAccount requestingOrganizationUser) {
        this.requestingOrganizationUser = requestingOrganizationUser;
    }

    public UserAccount getDonorOrganizationUser() {
        return donorOrganizationUser;
    }

    public void setDonorOrganizationUser(UserAccount donorOrganizationUser) {
        this.donorOrganizationUser = donorOrganizationUser;
    }
   
   
    

    @Override
    public String toString() {
        return getOrderID();
    }
    
    
    
}
