/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUMEDHA
 */import java.sql.*;
 import javax.swing.JOptionPane;
 
public class javaconnect {
    Connection cn;
    public static Connection ConnecrDb(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
            return cn;
        }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
         return null;
    }
       
    }}
