/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agenda;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
 *
 * @author suporte
 */
public class MinhaServlet  extends HttpServlet{
    
    private int contador = 0;
    
    @Override
    public void init(ServletConfig config)throws ServletException{
        super.init(config);
        
        log("servlet foi iniciada.");
    }
    @Override
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher rd = request.getRequestDispatcher("/adiciona-contato.jsp");
        rd.forward(request, response);
    }
    
    
    
    
    public void detroy(){
        super.destroy();
        log("Servlet foi destruido.");
    }
    
}
