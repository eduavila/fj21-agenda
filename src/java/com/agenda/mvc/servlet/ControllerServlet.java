/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.mvc.servlet;

/**
 * 
 * Import usados
 */


import com.agenda.mvc.logica.Logica;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;


/**
 *
 * @author eduardo
 */
public class ControllerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        
        String paramentro = request.getParameter("logica");
        String nomeDaClasse = "com.agenda.mvc.logica."+paramentro;
        
        try{
            Class classe = Class.forName(nomeDaClasse);
            Logica logica = (Logica) classe.newInstance();
            logica.executa(request,response);
        }catch(Exception e){
            throw new ServletException("A lógica de "+" negócios causou um exceção", e);
        }
        
        
    }
}
