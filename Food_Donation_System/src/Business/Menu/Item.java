/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.Date;

/**
 *
 * @author acer
 */
public class Item {
    private String description;
    private int id;
    private String imagePath;
    private int numberOfServings;
    private Date postdate;
    private String locationOfIndividual;
    private String itemStatus;
    
    
    static int count = 100;
    public Item() {
        this.id = count++;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
    
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public String getLocationOfIndividual() {
        return locationOfIndividual;
    }

    public void setLocationOfIndividual(String locationOfIndividual) {
        this.locationOfIndividual = locationOfIndividual;
    }

    
    
    @Override
    public String toString(){
        return Integer.toString(id);
    }
    
    
    
}
