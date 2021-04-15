/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RestaurantManagerRole;
import Business.Role.Role;        // update here -jayesh
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class RestaurantManagerOrganization  extends Organization{
     public RestaurantManagerOrganization() {
        super(Organization.Type.Manager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantManagerRole());       //update here -jayesh
        return roles;
    }
    
}
