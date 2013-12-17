/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eduardo
 */
public interface Logica{
    /**
     *
     * @param req
     * @param res
     * @throws Exception
     */
    public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
    
    
}
