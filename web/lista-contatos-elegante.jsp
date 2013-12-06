<%-- 
    Document   : lista-contatos-elegante
    Created on : 06/12/2013, 10:23:05
    Author     : suporte
--%>

<%--importando lib JSTL --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Cria o DAo -->
        <jsp:useBean id="dao" class="com.agenda.jdbc.dao.ContatoDao"/>
   
        <table border="1">
                    
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Endereco</th>
                    <th>DataNascimento</th>
                </tr>
            
            <!-- precorre contatos montando as linhas -->
            <c:forEach var="contato" items="${dao.lista}" varStatus="id">           
                <tr bgcolor="#${id.count%2 == 0? 'aaee88':'fffff'}">
                   
                    <td>${contato.nome}</td>
                   
                        <%-- <c:choose>
                            <c:when test="${not empty contato.email}">
                                  <a href="mailto:${contato.email}">${contato.email}</a></td>
                            </c:when>
                                  <c:otherwise>
                                    E-mail não informado
                                  </c:otherwise>

                        </c:choose>
                        --%>    
                        <td>
                            <c:if test=" ${not empty contato.email}">
                                 <a href="mailto:${contato.email}">${contato.email}</a>
                            </c:if> 
                            <c:if test="${empty contato.email}">
                                Email Não informado
                            </c:if>
                        </td>            
                       <td>${contato.endereco}</td>
                    <td>${contato.dataNascimento.time}</td>
                    
                    
                </tr>
            </c:forEach>
            
        </table>
    
    
    </body>
</html>
