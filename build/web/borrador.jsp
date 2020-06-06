<%-- 
    Document   : borrador
    Created on : 31/05/2018, 0:16:42
    Author     : pc1
--%>

<%@page import="herramientas.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        conexion con = new conexion();
        String del = "DELETE FROM \"comentario\" WHERE \"idcomentario\"="+request.getParameter("cmbdel");
        con.Ejecutar(del);
        response.sendRedirect("carr.jsp");
        %>
        
</html>
