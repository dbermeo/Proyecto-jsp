<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Ingresar
    Created on : 05/06/2018, 21:29:04
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
    <body BACKGROUND="fondo1.jpg">
        <div align="center"> 
<center> 
<IMG SRC="ari.png">
<table border="5" cellpadding="2" cellspacing="2" align="center">

<tr>

<td height="10" colspan="2">
<center>
<font face="Tw Cen MT"><font color="white"> <font size=32>Menu</font></font></font>

</td>

</tr>

<tr>

<td height="550">

    <input type= image src="consul.png" width="120" height="50" onclick = "location='carr.jsp'"/>
   <input type= image src="ins.png" width="120" height="50" onclick = "location='inser.jsp'"/>
   <input type= image src="elimi.png" width="120" height="50" onclick = "location='elimi.jsp'"/>

</td>

<td width="2000">
    
      
   <form action="borrador.jsp">
                   
       
          <%
        conexion con = new conexion();
        
       %>
        
                  <form action="borrador.jsp">
                   
                   <%
                   ResultSet res2 =con.Consulta("SELECT * FROM \"comentario\"");
                   %> 
                   <select name="cmbdel">
                       <%while(res2.next()){ %>
                       <option value = <%out.print(res2.getInt(1)); %>><%out.print(res2.getString(2)); %></option>
                       
                       <%} %>
                   </select>
                   
                   
                   <input type="submit" value="borrar" />
                  
                   
                   
               </form>
   




</td>

</tr>

<tr>

<td height="30" colspan="2">

<tiles:insertAttribute name="footer" />

</td>

</tr>

</table>
        
        
        </div>
    </body>
</html>
