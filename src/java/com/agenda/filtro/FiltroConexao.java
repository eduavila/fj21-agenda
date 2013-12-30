/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.filtro;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;
import java.sql.SQLException;


import com.agenda.jdbc.ConnectionFactory;
/**
 *
 * @author eduardo
 */
public class FiltroConexao implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    
    @Override 
    public void doFilter(ServletRequest request, ServletResponse reponse, FilterChain chain)throws IOException, ServletException{
        try{
            Connection connection = new ConnectionFactory().getConnection();
            
            // pendurrando connection  no request;
            
            request.setAttribute("conexao",connection);
            
            chain.doFilter(request, reponse);
            connection.close();
        }catch(SQLException e){
            throw new ServletException(e);
        }
    }

    
    @Override
    public void destroy() {
        
    }
    
}

