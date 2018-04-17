/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavajdbc;

/**
 *
 * @author devtr
 */
public class productEntity {
    int id ,catID;
    String proname;
    float price;
    int quality;
    /**
     * add data
     * @param catID
     * @param proname
     * @param price
     * @param quality 
     */
    public productEntity(int catID, String proname, float price, int quality) {
        this.catID = catID;
        this.proname = proname;
        this.price = price;
        this.quality = quality;
    }
    
    /**
     * load data
     * @param id
     * @param catID
     * @param proname
     * @param price
     * @param quality 
     */
    public productEntity(int id, int catID, String proname, float price, int quality) {
        this.id = id;
        this.catID = catID;
        this.proname = proname;
        this.price = price;
        this.quality = quality;
    }
    
}
