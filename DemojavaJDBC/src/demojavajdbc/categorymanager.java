/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavajdbc;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author devtr
 */
public class categorymanager {
    Connection conn;
    public categorymanager(){
        BKConnection bk = new BKConnection();
        this.conn= bk.cnn;
    }
    
    public  ArrayList<categoryEntity> loadcat(){
        ArrayList<categoryEntity> lstcat = new ArrayList<>();
        
        
        
        return  lstcat;
    }
}
