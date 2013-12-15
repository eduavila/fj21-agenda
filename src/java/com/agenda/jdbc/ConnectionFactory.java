/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agenda.jdbc;

/**
 *
 * 
 * @author Eduardo Avila Malheiros
 */
import java.sql.*;


public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","99463782");
        }catch(SQLException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception: "+ex.toString());
            throw new RuntimeException(ex);
        }
    } 
}
