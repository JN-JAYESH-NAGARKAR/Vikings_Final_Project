/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Menu {
    private ArrayList<Item> itemList;

    public Menu() {
        itemList = new ArrayList<>();
    }
    

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(Item item){
        itemList.add(item);
    }
    public void removeItem(Item item){
        itemList.remove(item);
    }
    
    
    
}
