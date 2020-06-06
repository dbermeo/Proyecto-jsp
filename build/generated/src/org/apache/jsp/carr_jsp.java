package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import herramientas.conexion;

public final class carr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body BACKGROUND=\"fondo1.jpg\">\n");
      out.write("        <div align=\"center\"> \n");
      out.write("<center> \n");
      out.write("<IMG SRC=\"ari.png\">\n");
      out.write("<table border=\"5\" cellpadding=\"2\" cellspacing=\"2\" align=\"center\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td height=\"10\" colspan=\"2\">\n");
      out.write("<center>\n");
      out.write("<font face=\"Tw Cen MT\"><font color=\"white\"> <font size=32>Consultas</font></font></font>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td height=\"550\">\n");
      out.write("\n");
      out.write("   <input type= image src=\"consul.png\" width=\"120\" height=\"50\" onclick = \"location='carr.jsp'\"/>\n");
      out.write("   <input type= image src=\"ins.png\" width=\"120\" height=\"50\" onclick = \"location='inser.jsp'\"/>\n");
      out.write("   <input type= image src=\"elimi.png\" width=\"120\" height=\"50\" onclick = \"location='elimi.jsp'\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td width=\"2000\">\n");
      out.write("    \n");
      out.write("           ");

        conexion con = new conexion();
       
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("            ");

              ResultSet rs1 = con.Consulta("SELECT * FROM \"proyecto\" ORDER BY idcarrera asc");
        
        
        
      out.write(" \n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("        <font face=\"Tw Cen MT\"><font color=\"white\"> <font size=32>Proyetos</font></font></font>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idproyecto</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>tema</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>descripcion</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idalumno</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idnivel</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idcarrera</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>imagen</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("     \n");
      out.write("               \n");
      out.write("                ");
while(rs1.next()){
                    
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                   <td face=\"Tw Cen MT\"><font color=\"white\">  ");
 out.print(rs1.getInt(1)); 
      out.write("</td>\n");
      out.write("                   <td face=\"Tw Cen MT\"><font color=\"white\">  ");
 out.print(rs1.getString(2)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs1.getString(3)); 
      out.write("</td>\n");
      out.write("                   <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs1.getInt(4)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\">  ");
 out.print(rs1.getInt(5)); 
      out.write("</td>\n");
      out.write("                   <td face=\"Tw Cen MT\"><font color=\"white\">  ");
 out.print(rs1.getInt(6)); 
      out.write("</td>\n");
      out.write("                   <td><img src= ");
out.print(rs1.getString(7));
      out.write(" width=\"80\" height=\"80\" alt=\"1\"/>\n");
      out.write("                   </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            <form action=\"formulario.jsp\" method=\"POST\">\n");
      out.write("        ");

       
        ResultSet rs = con.Consulta("SELECT * FROM \"proyecto\"");
        
        
        
      out.write(" \n");
      out.write("            <select name=\"comboform\">\n");
      out.write("                ");
while(rs.next()){ 
      out.write("\n");
      out.write("                <option value = ");
out.print(rs.getInt(1)); 
      out.write('>');
out.print(rs.getString(2)); 
      out.write("</option>\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Formulario\" />\n");
      out.write("              </form>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("                            ");
 ResultSet rs41= con.Consulta("SELECT * FROM \"comentario\""); 
      out.write("\n");
      out.write("                            \n");
      out.write("                            <font face=\"Tw Cen MT\"><font color=\"white\"> <font size=32>Comentarios</font></font></font>\n");
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idcomentario</th>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>comentario</th>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idproyecto</th>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>estudiante_comentario</th>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>email</th>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>calificacion</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 while(rs41.next()){
                            
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                           <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs41.getInt(1)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs41.getString(2)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs41.getInt(3)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs41.getString(4)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs41.getString(5)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs41.getString(6)); 
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("                ");
ResultSet rs2 = con.Consulta("SELECT * FROM \"carrera\"");
      out.write("\n");
      out.write("                <font face=\"Tw Cen MT\"><font color=\"white\"> <font size=32>Numero de comentarios</font></font></font>\n");
      out.write("           \n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>carrera</th>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>A</th>\n");
      out.write("                             <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>B</th>\n");
      out.write("                              <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>C</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    ");
while(rs2.next()){ 
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");
ResultSet rs3 = con.Consulta("SELECT count (*) FROM carrera, proyecto,comentario WHERE proyecto.idcarrera = "+rs2.getInt(1)+" and carrera.idcarrera = "+rs2.getInt(1)+" and comentario.idproyecto = proyecto.idproyecto and comentario.calificacion = 'A'");
      out.write("\n");
      out.write("                      ");
while(rs3.next()){ 
      out.write("\n");
      out.write("                      \n");
      out.write("                   ");
ResultSet rs4 = con.Consulta("SELECT count (*) FROM carrera, proyecto,comentario WHERE proyecto.idcarrera = "+rs2.getInt(1)+" and carrera.idcarrera = "+rs2.getInt(1)+" and comentario.idproyecto = proyecto.idproyecto and comentario.calificacion = 'B'");
      out.write("\n");
      out.write("                      ");
while(rs4.next()){ 
      out.write("\n");
      out.write("                      \n");
      out.write("                      ");
ResultSet rs5 = con.Consulta("SELECT count (*) FROM carrera, proyecto,comentario WHERE proyecto.idcarrera = "+rs2.getInt(1)+" and carrera.idcarrera = "+rs2.getInt(1)+" and comentario.idproyecto = proyecto.idproyecto and comentario.calificacion = 'C'");
      out.write("\n");
      out.write("                      ");
while(rs5.next()){ 
      out.write("\n");
      out.write("                      \n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                             <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs2.getString(2)); 
      out.write("</td>\n");
      out.write("                             <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs3.getString(1)); 
      out.write("</td>\n");
      out.write("                             <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getString(1)); 
      out.write("</td>\n");
      out.write("                             <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs5.getString(1)); 
      out.write("</td>\n");
      out.write("                             \n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");
} 
      out.write("\n");
      out.write("                     ");
} 
      out.write("\n");
      out.write("                      ");
} 
      out.write("\n");
      out.write("                      ");
} 
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("      \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("      \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td height=\"30\" colspan=\"2\">\n");
      out.write("\n");
      out.write("<tiles:insertAttribute name=\"footer\" />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
