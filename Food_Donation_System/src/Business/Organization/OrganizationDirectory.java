/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,String name, String locationPoint){
        Organization organization = null;
        if (type.getValue().equals(Type.Restaurant.getValue())) {
            organization = new RestaurantOrganization(name);
            organization.setLocationPoint(locationPoint);
            organization.setType(type);
            organizationList.add(organization);
        }
        return organization;
    }
}