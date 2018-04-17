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
public class categoryEntity {
    int id;
    String catname;

    public categoryEntity() {
    }

    public categoryEntity(int id, String catname) {
        this.id = id;
        this.catname = catname;
    }

    @Override
    public String toString() {
        return "categoryEntity{" + "catname=" + catname + '}';
    }
    
    
}
