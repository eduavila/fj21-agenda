<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%--importando tag custimizada "campoData" --%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="caelum"%>



<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
       
        <link type="text/css" href="css/ui-lightness/jquery-ui-1.10.3.custom.css" rel="Stylesheet" />      
        <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.10.3.custom.js"></script>

        
    </head>
    <body>

        <!-- importando Pagina cabeÁalho -->    
        <c:import url="cabecalho.jsp"/>


            <form action="addcontato" method="POST">
                Nome: <input type="text" name ="nome"/><br>
                E-mail: <input type="text" name="email"/> <br>
                Endere√ßo: <input type="text" name ="endereco"/><br>
                DataNacimento:<caelum:campoData id="DataNascimento"/><br>

                <hr>
                <input type="submit" value ="Gravar"/>
            </form>


        <!-- importando pagina rodape -->
        <c:import url="rodape.jsp"/>
        
    </body>
</html>
