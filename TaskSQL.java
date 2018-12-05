/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.laba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Root
 */
public class Work {

    Connection connection = null; 
    String host = "localhost"; 
    String port = "3306";
    String user = "laba"; 
    String passw = "password"; 
    String base = "laba"; 
    public Work() {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + base, user, passw); // створюємо зєднання
            System.out.println("Connect to database "+base+" ok!");
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
   
   public void getAdmin()
   {
       
       String sql = "select * from users where role = 'admin'";
       Statement st =null; 
       ResultSet rs = null; 
        try {
            st = connection.createStatement(); 
            rs  = st.executeQuery(sql); 
            while (rs.next()) 
            {
                String name = rs.getString("name"); 
                String login = rs.getString("login"); 
                boolean isActive = rs.getBoolean("isActive");
                System.out.printf("Admin: %s, login: %s,  active: %b \n", name,login,isActive);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   
   
   public void getUserByRole(String role)
   {
       
       String sql = "select * from users where role = ? "; 
       PreparedStatement pst =null; 
       ResultSet rs = null; 
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1,role); 
            rs  = pst.executeQuery(); 
            while (rs.next()) 
            {
                String name = rs.getString("name"); 
                String login = rs.getString("login"); 
                boolean isActive = rs.getBoolean("isActive");
                Date createDate  = rs.getDate("createDate");
                System.out.printf("User: %s, login: %s, create: %tD, active: %b \n", name,login,createDate,isActive);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }

}
