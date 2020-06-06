<%-- 
    Document   : ingre
    Created on : 05/06/2018, 14:10:44
    Author     : Cristhian
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
    <body>
        <h1>Hello World!</h1>
         <%
        conexion con = new conexion();
        ResultSet rs = con.Consulta("SELECT COUNT(*) FROM \"proyecto\"");
        int id= 0;
while(rs.next()){
    id= rs.getInt(1)+1;
}
 String tem = request.getParameter("tema");
 String des = request.getParameter("descripcion");
 String idalum= request.getParameter("combo2");
 String idniv= request.getParameter("combo3");
 String idcar= request.getParameter("combo4");
 String img= request.getParameter("imag");
 
String qwe= "INSERT INTO public.proyecto(idproyecto, tema, descripcion, idalumno, idnivel, idcarrera, imagen)" + "VALUES ("+id+",'"+tem+"','"+des+"',"+idalum+","+idniv+","+idcar+",'"+img+"')";
con.Ejecutar(qwe);
response.sendRedirect("carr.jsp");
 

        %> 
        <%
            
        
        
        %>
    </body>
</html>
