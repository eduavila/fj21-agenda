/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.agenda.jdbc.modelo.Contato;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.agenda.jdbc.dao.ContatoDao;
import javax.servlet.RequestDispatcher;

import java.sql.Connection;
/**
 *
 * @author eduardo
 */
public class AlterarContatoLogic implements  Logica {

    @Override
    public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        Contato contato = new Contato();
        
        long id = Long.parseLong(req.getParameter("id"));
        
        contato.setId(id);
        contato.setNome(req.getParameter("nome").replaceAll(" "," "));
        contato.setEmail(req.getParameter("email"));
        contato.setEndereco(req.getParameter("endereco"));
        // Converte a data de String para util.Date
        String dataEmTexto = req.getParameter("dataNascimento");
        
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(date);
        
        contato.setDataNascimento(dataNascimento);
        
        //Busca a conexão pendurada na requisição 
        Connection connection = (Connection) req.getAttribute("conexao");
        
        
        // passe a conexão no construtor
        ContatoDao dao = new ContatoDao(connection);
        
        dao.atualiza(contato);
        
        RequestDispatcher rd = req.getRequestDispatcher("lista-contatos-elegante.jsp");
        rd.forward(req, res);
        
        
        System.out.println("Alterando contato com sucesso...."+contato.getNome());
    
    }
    
}
