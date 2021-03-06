/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agenda;

import java.io.IOException;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import com.agenda.jdbc.modelo.*;
import com.agenda.jdbc.dao.*;
import com.agenda.jdbc.ConnectionFactory.*;

/**
 *
 * @author suporte
 */
public class AdicionaContatoServlet extends HttpServlet{
    
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        // pegando paramentro do request
        
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String dataEmTexto = request.getParameter("DataNascimento");
        Calendar dataNascimento = null;
        
        // fazendo a conversão da data
        
        try{
          
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(data);
           
        }catch(ParseException e){
            out.println("Erro de conversão de data."+e.toString());
            return;// para a execução do método
        }
        
        
        // monta um objeto contato
        
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEndereco(endereco);
        contato.setEmail(email);
        contato.setDataNascimento(dataNascimento);
        
        // salvar o contato
        
        ContatoDao dao = new ContatoDao();
        
        dao.Adicionar(contato);
        
        // imprime o nome do contato que foi adicionado
      
      // redirecionado para pagina contato-adicionado.jsp
      RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
      
      rd.forward(request, response);
      
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        
    }
  
}
