/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agenda;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 *
 * @author suporte
 */
public class OiMundo extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      
      //ecreve o texto
      
      out.println("<html>");
      out.println("<body>");
      out.println("<h1>Ola Mundo!</h1>");
      out.println("</body>");
      out.println("</html>");
            
      
    }
    
    
}
