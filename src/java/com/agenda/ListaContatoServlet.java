/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agenda;


import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.agenda.jdbc.dao.ContatoDao;
import com.agenda.jdbc.modelo.Contato;
import java.util.List;
/**
 *
 * @author suporte
 */
public class ListaContatoServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Lista de Contatos</h1>");
        out.println("<table>");
        out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Nome</th>");
            out.println("<th>Email</th>");
            out.println("<th>Endereco</th>");
            out.println("<th>Data Nascimento</th>");
             out.println("</tr>");
            List<Contato> Contatos = new ContatoDao().getLista();
            out.println("<tr>");
            for(Contato contato :Contatos){
                  out.println("<td>");
                  out.println(contato.getId().toString());
                  out.println("</td>");
                  out.println("<td>");
                  out.println(contato.getNome().toString());
                   out.println("</td>");
                   out.println("<td>");
                  out.println(contato.getEmail().toString());
                   out.println("</td>");
                    out.println("<td>");
                  out.println(contato.getEndereco().toString());
                   out.println("</td>");
                    out.println("td>");
                  out.println(contato.getDataNascimento().toString());
                   out.println("</td>");
            }
         out.println("</tr>");
        out.println("</table>");
        
     
        out.println("</body>");
        out.println("</html>");
        
 
    }
       
}
