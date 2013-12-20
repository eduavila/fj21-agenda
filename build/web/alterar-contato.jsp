<%-- 
    Document   : alterar-contato
    Created on : 17/12/2013, 19:47:55
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="caelum" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <link type="text/css" href="css/ui-lightness/jquery-ui-1.10.3.custom.css" rel="Stylesheet" />    
         <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
          <script type="text/javascript" src="js/jquery-ui-1.10.3.custom.js"></script>
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        
            Formulário para alteração de contatos: <br>
            
            <form action="mvc" method="POST">
                Id:
                    <input type ="text" name="id"/> <br>
                Nome:
                    <input type="text" name ="nome"/><br>
                E-Mail:
                    <input type="text" name="email"/><br>
                Endereço:
                    <input type="text" name="endereco"/><br>
                Data de Nascimento:
                    <caelum:campoData id="dataNascimento"/>
                    
                    <input type="hidden" name="logica" value="AlterarContatoLogic"/>
                    <input type="submit" value="Enviar"/>

            </form>
         <c:import url="rodape.jsp"/>
    </body>
</html>
