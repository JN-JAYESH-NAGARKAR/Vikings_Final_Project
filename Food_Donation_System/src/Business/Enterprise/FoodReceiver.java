/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodReceiver extends Enterprise {
    public FoodReceiver(String name){
        super(name,Enterprise.EnterpriseType.FoodReceiver);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
