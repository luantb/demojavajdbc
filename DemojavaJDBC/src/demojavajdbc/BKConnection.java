/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.jca.GetInstance;

/**
 *
 * @author Admin
 */
public class BKConnection {

    Connection cnn;
    final String HOST = "jdbc:sqlserver://localhost\\DESKTOP-755C9DH:1433;databaseName=C1610mSTORE";
    final String USERNAME = "sa";
    final String PASSWORD = "123456";       

    public BKConnection() {
        try {
            // Load driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Lấy đối tượng kết nối Connection
            cnn = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi nhập thư viện JDBC");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
