/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IndividualReceiverOrganaizationAdminRole;
import Business.Role.RestaurantAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class IndividualReceiverOrganization extends Organization {
    public IndividualReceiverOrganization(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IndividualReceiverOrganaizationAdminRole());
        return roles;
    }
    
}