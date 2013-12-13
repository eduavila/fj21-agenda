<%-- 
    Document   : cabecalho
    Created on : 13/12/2013, 14:17:00
    Author     : suporte
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             #titulo{
                float:right;
            }
            
            #titulo{
                width: 300px;
                height: 100px;
            }
         </style>
    </head>
    <body>
        
        <!-- url com TagLib -->
        
        <c:url value="img/Logo.jpg" var="imagem"/>
        
        <!-- c:url value="" var ="" -->
        <img src="<c:url value="img/Logo.jpg"/>" width="200" height="150" alt="Logo"/>
        <div class="titulo"><h1>Fj21-Agenda</h1></div>
        <hr>

    </body>
</html>
