/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavajdbc;

import com.sun.jndi.cosnaming.CNNameParser;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public  ArrayList<categoryEntity> loadcat() throws SQLException{
        ArrayList<categoryEntity> lstcat = new ArrayList<>();
        
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("{CALL getallCategory}");
        
        while (rs.next()) {
            categoryEntity cat  = new categoryEntity(rs.getInt("id"), rs.getString("catname"));
            lstcat.add(cat);
            
        }
        
        
        return  lstcat;
    }
}
