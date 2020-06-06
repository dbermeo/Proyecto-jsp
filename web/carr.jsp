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
<font face="Tw Cen MT"><font color="white"> <font size=32>Consultas</font></font></font>

</td>

</tr>

<tr>

<td height="550">

   <input type= image src="consul.png" width="120" height="50" onclick = "location='carr.jsp'"/>
   <input type= image src="ins.png" width="120" height="50" onclick = "location='inser.jsp'"/>
   <input type= image src="elimi.png" width="120" height="50" onclick = "location='elimi.jsp'"/>

</td>

<td width="2000">
    
           <%
        conexion con = new conexion();
       %> 
        
        
           
            
            
        
            <%
              ResultSet rs1 = con.Consulta("SELECT * FROM \"proyecto\" ORDER BY idcarrera asc");
        
        
        %> 
        <br>

<center>
        <font face="Tw Cen MT"><font color="white"> <font size=32>Proyetos</font></font></font>
        <table border="1">
            <thead>
                <tr>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>idproyecto</th>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>tema</th>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>descripcion</th>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>idalumno</th>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>idnivel</th>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>idcarrera</th>
                    <th face="Tw Cen MT"><font color="white"> <font size=10>imagen</th>
                </tr>
            </thead>
            <tbody>
            
           
     
               
                <%while(rs1.next()){
                    %>
                <tr>
                   <td face="Tw Cen MT"><font color="white">  <% out.print(rs1.getInt(1)); %></td>
                   <td face="Tw Cen MT"><font color="white">  <% out.print(rs1.getString(2)); %></td>
                    <td face="Tw Cen MT"><font color="white"> <% out.print(rs1.getString(3)); %></td>
                   <td face="Tw Cen MT"><font color="white"> <% out.print(rs1.getInt(4)); %></td>
                    <td face="Tw Cen MT"><font color="white">  <% out.print(rs1.getInt(5)); %></td>
                   <td face="Tw Cen MT"><font color="white">  <% out.print(rs1.getInt(6)); %></td>
                   <td><img src= <%out.print(rs1.getString(7));%> width="80" height="80" alt="1"/>
                   </td>
                </tr>
                <% } %>
            </tbody>
        </table>
            
            <form action="formulario.jsp" method="POST">
        <%
       
        ResultSet rs = con.Consulta("SELECT * FROM \"proyecto\"");
        
        
        %> 
            <select name="comboform">
                <%while(rs.next()){ %>
                <option value = <%out.print(rs.getInt(1)); %>><%out.print(rs.getString(2)); %></option>
                
                <%}%>
            </select>
            <br>
            
            <input type="submit" value="Formulario" />
              </form>
            
            <br>

                            <% ResultSet rs41= con.Consulta("SELECT * FROM \"comentario\""); %>
                            
                            <font face="Tw Cen MT"><font color="white"> <font size=32>Comentarios</font></font></font>

            <table border="1">
                    <thead>
                        <tr>
                            
                            <th face="Tw Cen MT"><font color="white"> <font size=10>idcomentario</th>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>comentario</th>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>idproyecto</th>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>estudiante_comentario</th>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>email</th>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>calificacion</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% while(rs41.next()){
                            %>
                        <tr>
                            
                           <td face="Tw Cen MT"><font color="white"><%out.print(rs41.getInt(1)); %></td>
                            <td face="Tw Cen MT"><font color="white"><%out.print(rs41.getString(2)); %></td>
                            <td face="Tw Cen MT"><font color="white"><%out.print(rs41.getInt(3)); %></td>
                            <td face="Tw Cen MT"><font color="white"><%out.print(rs41.getString(4)); %></td>
                            <td face="Tw Cen MT"><font color="white"><%out.print(rs41.getString(5)); %></td>
                            <td face="Tw Cen MT"><font color="white"><%out.print(rs41.getString(6)); %></td>
                        </tr>
                        <% } %>
                        
                    </tbody>
                    
                </table>
            <br>

                <%ResultSet rs2 = con.Consulta("SELECT * FROM \"carrera\"");%>
                <font face="Tw Cen MT"><font color="white"> <font size=32>Numero de comentarios</font></font></font>
           
                <table border="1">
                    <thead>
                        <tr>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>carrera</th>
                            <th face="Tw Cen MT"><font color="white"> <font size=10>A</th>
                             <th face="Tw Cen MT"><font color="white"> <font size=10>B</th>
                              <th face="Tw Cen MT"><font color="white"> <font size=10>C</th>
                        </tr>
                    </thead>

                    <%while(rs2.next()){ %>
                    
                    <%ResultSet rs3 = con.Consulta("SELECT count (*) FROM carrera, proyecto,comentario WHERE proyecto.idcarrera = "+rs2.getInt(1)+" and carrera.idcarrera = "+rs2.getInt(1)+" and comentario.idproyecto = proyecto.idproyecto and comentario.calificacion = 'A'");%>
                      <%while(rs3.next()){ %>
                      
                   <%ResultSet rs4 = con.Consulta("SELECT count (*) FROM carrera, proyecto,comentario WHERE proyecto.idcarrera = "+rs2.getInt(1)+" and carrera.idcarrera = "+rs2.getInt(1)+" and comentario.idproyecto = proyecto.idproyecto and comentario.calificacion = 'B'");%>
                      <%while(rs4.next()){ %>
                      
                      <%ResultSet rs5 = con.Consulta("SELECT count (*) FROM carrera, proyecto,comentario WHERE proyecto.idcarrera = "+rs2.getInt(1)+" and carrera.idcarrera = "+rs2.getInt(1)+" and comentario.idproyecto = proyecto.idproyecto and comentario.calificacion = 'C'");%>
                      <%while(rs5.next()){ %>
                      
                    <tbody>
                        <tr>
                             <td face="Tw Cen MT"><font color="white"><%out.print(rs2.getString(2)); %></td>
                             <td face="Tw Cen MT"><font color="white"><%out.print(rs3.getString(1)); %></td>
                             <td face="Tw Cen MT"><font color="white"><%out.print(rs4.getString(1)); %></td>
                             <td face="Tw Cen MT"><font color="white"><%out.print(rs5.getString(1)); %></td>
                             
                        
                
                            
                        </tr>
                    </tbody>
                    <%} %>
                     <%} %>
                      <%} %>
                      <%} %>
                </table>

      
        
       
    
    
   
      
      
        
        
        
    
    
        
        
        
   


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
