/**
 * 
 * 
 * 
 */
package com.agenda.jdbc.modelo;



/**
 *
 * @author Eduardo Avila Malheiros
 */
import java.util.*;

public class Contato {
    private Long id;
    private String nome;
    private String email;
    private String endereco;
    private Calendar datanascimento;
    
    
    //Métodos get e set da propriedades
    
    // ID
    public Long getId(){
        return this.id;
    }
    public void setId(Long novo){
        this.id = novo;
    }
    // Nome
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novo){
        this.nome = novo;
    }
    
    // email
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String novo){
        this.email=novo;
    }
    
    // endereco
    
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String novo){
        this.endereco = novo;
    }
    
    // DataNascimento
    
    public Calendar getDataNascimento(){
        return this.datanascimento;
    }
    public void setDataNascimento(Calendar novo){
        this.datanascimento = novo;
    }
}
