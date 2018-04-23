/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavajdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author devtr
 */
public class Productmanager {
        Connection conn;
    public Productmanager(){
        BKConnection bk = new BKConnection();
        this.conn= bk.cnn;
    }
    
    public  ArrayList<productEntity> loadpro() throws SQLException{
        ArrayList<productEntity> lstpro = new ArrayList<>();
        
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("{CALL getAllProduct}");
        
        while (rs.next()) {
            productEntity pro  = new productEntity(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getFloat(4),rs.getInt(5));
            lstpro.add(pro);
        }
        return  lstpro;
    }
}
