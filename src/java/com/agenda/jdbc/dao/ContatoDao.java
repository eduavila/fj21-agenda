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
        String sql = "INSERT INTO contatos"+
                "(nome,email,endereco,dataNascimento)"+
                "values (?,?,?,?)";
        
        try{
            // prepared statement
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1,contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3,contato.getEndereco());
            
            java.sql.Date data = new java.sql.Date(contato.getDataNascimento().getTimeInMillis());
            stmt.setDate(4,data);
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    public List<Contato> getLista(){
        try{
            List<Contato> contatos = new ArrayList();
            
            PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
            
            ResultSet query = stmt.executeQuery();
            
            while(query.next()){
                // cria objeto contato para add na List
                Contato contato =new Contato();
                contato.setId(query.getLong("id"));
                contato.setNome(query.getString("nome"));
                contato.setEndereco(query.getString("endereco"));
                contato.setEmail(query.getString("email"));
                
                Calendar data = Calendar.getInstance();
                if(query.getDate("dataNascimento")!= null){
                    data.setTime(query.getDate("dataNascimento"));
                    contato.setDataNascimento(data);
                }
                contatos.add(contato);
            }
            
            query.close();
            stmt.close();
            
            return contatos;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    public void atualiza(Contato contato){
        try{

            String sql = "update contatos set nome=?, email=?,"
                    +"endereco=?, dataNascimento=? where id=?";

            
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            
             stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4,new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(5, contato.getId());
            stmt.execute();
            stmt.close();

                  
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    
    public void remove(Contato contato){
        try{
            PreparedStatement stmt = this.connection.prepareStatement("Delete from contato where id=?");
            stmt.setLong(1,contato.getId());
            
            stmt.execute();
            stmt.close();
        
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
