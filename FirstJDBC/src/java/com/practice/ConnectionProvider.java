/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import java.sql.*;
/**
 *
 * @author mohit
 */
public class ConnectionProvider {
    private static Connection con;
    
    public static Connection getConnection()
    
    {
        
        try{
            
            if(con==null){
                System.out.println("uper");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                System.out.println("nicche");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","root");
                System.out.println("success...");
            
            
            
            }
        }
        
        catch(Exception e)
        {
            
            System.out.println("outttt..............");
            e.printStackTrace();
            
        }
        
        
        return con;
        
    }
    
    
    
}
