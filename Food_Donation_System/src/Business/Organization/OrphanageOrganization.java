/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DriverRole;
import Business.Role.OrphanageOrganaizationAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class OrphanageOrganization extends Organization {
    public OrphanageOrganization(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrphanageOrganaizationAdminRole());
        return roles;
    }
    
}
