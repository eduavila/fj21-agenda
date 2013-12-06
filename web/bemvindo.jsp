
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.*,com.agenda.jdbc.dao.*,com.agenda.jdbc.modelo.*"%>
<html>
    <head>
        
    </head>
    
    <body>
        
        <table border="1"> 
            <%--Titulo da table --%>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Endereço</th>
                <th>Data Nascimento</th>
              
                
            </tr>
                <%
                ContatoDao dao = new ContatoDao();
                List<Contato> contatos = dao.getLista();
                
                for(Contato contato:contatos){
                %>
                <tr>
                    <td><%= contato.getId() %></td>
                    <td><%= contato.getNome() %></td>
                    <td><%= contato.getEmail() %></td>
                    <td><%= contato.getEndereco() %></td>
                    <td><% if(contato.getDataNascimento() != null){ %>
                            <% Date data = new Date();
                               
                               SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                               String dataFormatada = formato.format(contato.getDataNascimento().getTime());
                              
                            %>
                            <%=dataFormatada %>
                        <% } %>
                    </td>
                </tr>
                <%
                    }
                %>
        </table>
        
        
    
         
        
    </body>
</html>