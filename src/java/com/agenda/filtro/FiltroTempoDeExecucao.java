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
import javax.servlet.http.HttpServletRequest;
/**
 * 
 * 
 *
 * @author eduardo
 */
public class FiltroTempoDeExecucao implements javax.servlet.Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long tempoInicial = System.currentTimeMillis();
        
        System.out.println("Antes do doFilter ....");
        chain.doFilter(request,response);
        System.out.println("Depois do doFilter ....");
        
        long tempoFinal = System.currentTimeMillis();
        
        String uri = ((HttpServletRequest) request).getRequestURI();
          
        System.out.println("Tempo da Requisição de "+ uri+" demorou(ms):"+(tempoFinal-tempoInicial));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }

    @Override
    public void destroy() {
  
    }

 
    
}
