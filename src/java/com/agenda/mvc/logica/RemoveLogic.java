/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.mvc.logica;


import com.agenda.jdbc.dao.ContatoDao;
import com.agenda.jdbc.modelo.Contato;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;


/**
 *
 * @author eduardo
 */
public class RemoveLogic implements Logica{

    @Override
    public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        
        Contato contato = new Contato();
        contato.setId(Long.parseLong(req.getParameter("id")));
        
        // pegando conexão  do request
        
        Connection connection = (Connection) req.getAttribute("conexao");
        
        ContatoDao dao = new ContatoDao();
        
        dao.remove(contato);
        
        
        RequestDispatcher rd = req.getRequestDispatcher("lista-contatos-elegante.jsp");
        
        System.out.println("Removido usuario ID: "+ contato.getId()+" com sucesso.");
    
    }
    
    
}
