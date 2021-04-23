/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import java.util.Date;



/**
 *
 * @author Jayesh Nagarkar
 */
public class DeliveryWorkRequest extends WorkRequest{
    private int orderId;
    
    private Organization.Type requestingOrganizationType;
    private Organization requestingOrganiztionName;
    
    
    private String pickupAddress;
    private String deliveryAddress;
    
   
    private String status;
    private Date deliveryTimestamp;
    
    
    
   
    
    private static int counter = 10000;
    
    public DeliveryWorkRequest(){
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryTimestamp() {
        return deliveryTimestamp;
    }

    public void setDeliveryTimestamp(Date deliveryTimestamp) {
        this.deliveryTimestamp = deliveryTimestamp;
    }
    
    
    
    
    
}
