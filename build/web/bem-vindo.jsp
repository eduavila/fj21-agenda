<%-- 
    Document   : bem-vindo
    Created on : 05/12/2013, 16:24:53
    Author     : suporte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <% 
                String mensagem = "Bem-Vindo";
                out.println(mensagem);
                
                String msg = "Ola mundo";
            %>
            
            <%--Comentário --%>
            <br>
            <%=msg %>
        </h1>
    </body>
</html>
