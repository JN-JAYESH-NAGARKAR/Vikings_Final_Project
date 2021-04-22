/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jayesh Nagarkar
 */
public class OrphanWorkRequest extends WorkRequest{
    
    private int orderId;
    private Date OrderRequestTime;
    private Date orderDeliveryTime;
    private String Status;
    private int no_of_servings;
    
    private String location;
    private UserAccount requestingOrganizationUser;
    private Organization requestingOrganization;
    private Type requestingOrganizationType;
    private String emailId;
    
    private Organization donorOrganization;
    private UserAccount donorOrganizationUser;
    
    
    
    private static int counter = 1000;
    
    public OrphanWorkRequest(){
        orderId = counter++;
        
    }

    public Date getOrderRequestTime() {
        return OrderRequestTime;
    }

    public void setOrderRequestTime(Date OrderRequestTime) {
        this.OrderRequestTime = OrderRequestTime;
    }

    public Date getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    public void setOrderDeliveryTime(Date orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getNo_of_servings() {
        return no_of_servings;
    }

    public void setNo_of_servings(int no_of_servings) {
        this.no_of_servings = no_of_servings;
    }

    public Organization getDonorOrganization() {
        return donorOrganization;
    }

    public void setDonorOrganization(Organization donorOrganization) {
        this.donorOrganization = donorOrganization;
    }

    public UserAccount getDonorOrganizationUser() {
        return donorOrganizationUser;
    }

    public void setDonorOrganizationUser(UserAccount donorOrganizationUser) {
        this.donorOrganizationUser = donorOrganizationUser;
    }

    public UserAccount getRequestingOrganizationUser() {
        return requestingOrganizationUser;
    }

    public void setRequestingOrganizationUser(UserAccount requestingOrganizationUser) {
        this.requestingOrganizationUser = requestingOrganizationUser;
    }

    public Organization getRequestingOrganization() {
        return requestingOrganization;
    }

    public void setRequestingOrganization(Organization requestingOrganization) {
        this.requestingOrganization = requestingOrganization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Type getRequestingOrganizationType() {
        return requestingOrganizationType;
    }

    public void setRequestingOrganizationType(Type requestingOrganizationType) {
        this.requestingOrganizationType = requestingOrganizationType;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    
    

    @Override
    public String toString() {
        return "STMQ" + orderId;
    }
    
    
    
}
