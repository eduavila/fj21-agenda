/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agenda.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;



import com.agenda.jdbc.*;
import com.agenda.jdbc.modelo.*;
/**
 *
 * @author suporte
 */


public class ContatoDao {
    private Connection connection;
    
    public ContatoDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    
    public void Adicionar(Contato contato){        
        String sql = "INSERT INTO CONTATOS"+
                "(nome,email,endereco)"+
                "values (?,?,?)";
        
        try{
            // prepared statement
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1,contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3,contato.getEndereco());
       
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
