/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Menu.Menu;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jayesh Nagarkar
 */
public class IndividualWorkRequest extends WorkRequest {
    private Menu menu;
    private Organization donorOrganization;
    private UserAccount donorAccount;
    
    private Organization receivingOrganization;
    private UserAccount receivingAccount;
    private String Status;
    private Date postedDate;
    private Date claimedDate;
    private int requestIdNumber;
    
    private static int counter = 9999;
    
    public IndividualWorkRequest(){
        counter--;
        
    }

    public Menu getMenu() {
        return menu;
    }

    public UserAccount getDonorAccount() {
        return donorAccount;
    }

    public void setDonorAccount(UserAccount donorAccount) {
        this.donorAccount = donorAccount;
    }

    public UserAccount getReceivingAccount() {
        return receivingAccount;
    }

    public void setReceivingAccount(UserAccount receivingAccount) {
        this.receivingAccount = receivingAccount;
    }
    

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Organization getDonorOrganization() {
        return donorOrganization;
    }

    public void setDonorOrganization(Organization donorOrganization) {
        this.donorOrganization = donorOrganization;
    }

    public Organization getReceivingOrganization() {
        return receivingOrganization;
    }

    public void setReceivingOrganization(Organization receivingOrganization) {
        this.receivingOrganization = receivingOrganization;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public Date getClaimedDate() {
        return claimedDate;
    }

    public void setClaimedDate(Date claimedDate) {
        this.claimedDate = claimedDate;
    }

    public int getRequestIdNumber() {
        return requestIdNumber;
    }

    public void setRequestIdNumber(int requestIdNumber) {
        this.requestIdNumber = requestIdNumber;
    }
    
    
    
    
    
    
    
    @Override
    public String toString(){
        return "IND"+requestIdNumber;
    }
    
    
}
