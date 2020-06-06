<%-- 
    Document   : formulario
    Created on : 06/06/2018, 3:45:40
    Author     : pc1
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="herramientas.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
    <body BACKGROUND="marco.png">
        <h1>Formulario!</h1>
      <%
        conexion con = new conexion();
          ResultSet rs = con.Consulta("SELECT * FROM \"proyecto\" WHERE idproyecto =" + request.getParameter("comboform"));
        
       
        %> 
        
        
     <table border="1">
            <thead>
                <tr>
                   
                </tr>
            </thead>
            <tbody>
                <%while(rs.next()){ %>
                <tr>
                    <td face="Tw Cen MT"><font color="black"> <font size=35> <% out.print(rs.getString(2)); %></td>
                </tr>
                <%} %>
            </tbody>
        </table>

        
        <%
         ResultSet rs1 = con.Consulta("SELECT * FROM \"proyecto\" WHERE idproyecto =" + request.getParameter("comboform"));
        
       
        %> 
        
                           
        <table border="1">
            <thead>
                <tr>
                   
                </tr>
            </thead>
            <tbody>
                <%while(rs1.next()){ %>
                <tr>
                   <td><img src= <%out.print(rs1.getString(7));%> width="600" height="600" alt="1"/>
                   </td>
                </tr>
                <%} %>
            </tbody>
        </table>

            
            
             <%
         ResultSet rs2 = con.Consulta("SELECT * FROM \"proyecto\" WHERE idproyecto =" + request.getParameter("comboform"));
        
       
        %> 
        
                           
        <table border="1">
            <thead>
                <tr>
                   
                </tr>
            </thead>
            <tbody>
                <%while(rs2.next()){ %>
                <tr>
                   <td face="Tw Cen MT"><font color="black"> <font size=20> <% out.print(rs2.getString(3)); %></td>
                </tr>
                <%} %>
            </tbody>
        </table>
        
     
     
        
        
    </body>
</html>
