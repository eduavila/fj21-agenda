/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.mvc.logica;
import com.agenda.mvc.logica.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author eduardo
 */

public class PrimeiraLogica implements Logica{

    @Override
    public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
       System.out.println("Executando a logica "+
               "e redirecionando...");
       
       RequestDispatcher rd = req.getRequestDispatcher("/primeira-logica.jsp");
       
       rd.forward(req, res);
    
    }
}
