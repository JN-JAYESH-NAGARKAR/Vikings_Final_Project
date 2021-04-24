/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Role.IndividualDonorRole;
import Business.Role.RestaurantAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class IndividualFoodDonorOrganization extends Organization {
    private String ifCertified = "not certified";
    private String officerName = "not assigned";
    private int NoOfServingsLeft = 10;
    
    private Menu menu;
    
    public IndividualFoodDonorOrganization(String name){
        super(name);
        menu = new Menu();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IndividualDonorRole());
        return roles;
    }
    public String getIfCertified(){
        System.out.println("indiv food donor org lin number 38 "+ this.ifCertified);
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
    
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public int calculateNumberOfServings(){
        int numberOfservings = 0;
        if(menu == null) menu = new Menu();
        for(Item item : menu.getItemList()){
            numberOfservings = numberOfservings + item.getNumberOfServings();
        }
        return numberOfservings;
    }
}
