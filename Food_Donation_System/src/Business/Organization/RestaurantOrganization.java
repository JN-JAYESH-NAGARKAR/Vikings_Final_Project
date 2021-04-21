/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RestaurantAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class RestaurantOrganization extends Organization {
    private String ifCertified = "not certified";
    private String officerName = "not assigned";
    private int NoOfServingsLeft = 10;
    
    public RestaurantOrganization(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantAdminRole());
        return roles;
    }
    public String getIfCertified(){
        return ifCertified;
    }
    public String getOfficerName(){
        return officerName;
    }
    public void setIfCertified(String ifCertified){
        this.ifCertified = ifCertified;
    }
    public void setOfficerName(String officer){
        this.officerName = officer;
    }

    public int getNoOfServingsLeft() {
        return NoOfServingsLeft;
    }

    public void setNoOfServingsLeft(int NoOfServingsLeft) {
        this.NoOfServingsLeft = NoOfServingsLeft;
    }
    
}
