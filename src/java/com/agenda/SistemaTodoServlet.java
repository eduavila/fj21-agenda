/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda;





import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.agenda.jdbc.dao.ContatoDao;
import com.agenda.jdbc.modelo.Contato;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/**
 *
 * @author eduardo
 */


// Toda as Lógicas dentro de uma Servlet 
public class SistemaTodoServlet extends HttpServlet {
    
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        String acao = request.getParameter("logica");
        ContatoDao dao = new ContatoDao();
        
        
        if(acao.equals("AdicionaContato")){
            Contato contato = new Contato();
            contato.setNome(request.getParameter("nome"));
            contato.setEndereco(request.getParameter("endereco"));
            contato.setEmail(request.getParameter("email"));
            
            dao.Adicionar(contato);
            
            RequestDispatcher rd = request.getRequestDispatcher("/contato.adicionado.jsp");
            
            rd.forward(request, response);

        }else if(acao.equals("ListaContatos")){
            //Busca a lista no DAO
            //despacha para jsp
        }else if(acao.equals("RemoveContato")){
            //faz a remoção e redireciona para a lista
        }
    }
    
}
