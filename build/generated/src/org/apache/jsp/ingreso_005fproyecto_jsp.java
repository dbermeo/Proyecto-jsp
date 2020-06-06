package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import herramientas.conexion;

public final class ingreso_005fproyecto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("<font face=\"Tw Cen MT\"><font color=\"white\"> <font size=32>Menu</font></font></font>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td height=\"550\">\n");
      out.write("\n");
      out.write("    <input type= image src=\"consul.png\" width=\"120\" height=\"50\" onclick = \"location='carr.jsp'\"/>\n");
      out.write("   <input type= image src=\"ins.png\" width=\"120\" height=\"50\" onclick = \"location='inser.jsp'\"/>\n");
      out.write("   <input type= image src=\"elimi.png\" width=\"120\" height=\"50\" onclick = \"location='elimi.jsp'\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td width=\"2000\">\n");
      out.write("    \n");
      out.write("      \n");
      out.write("     <h1>Ingreso de nuevo proyecto</h1>\n");
      out.write("        ");

        conexion con = new conexion();
        ResultSet rs = con.Consulta("SELECT * FROM \"proyecto\" WHERE idcarrera =" + request.getParameter("combo1"));
        
        
        
      out.write("\n");
      out.write("        <form action=\"ingre.jsp\" method=\"POST\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                     <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idproyecto</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>tema</th>\n");
      out.write("                     <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>descripcion</th>\n");
      out.write("                    <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idalumno</th>\n");
      out.write("                     <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idnivel</th>\n");
      out.write("                     <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>idcarrera</th>\n");
      out.write("                     <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>imagen</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
while(rs.next()){
                    
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                   <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs.getInt(1)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs.getString(3)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs.getInt(4)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs.getInt(5)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\">");
 out.print(rs.getInt(6)); 
      out.write("</td>\n");
      out.write("                    <td face=\"Tw Cen MT\"><font color=\"white\"> ");
 out.print(rs.getString(7)); 
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>imagenes</th>\n");
      out.write("                        <th>   </th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><img src=\"1.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"2.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"3.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                        <td><img src=\"4.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"5.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"6.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td><img src=\"7.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"8.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"9.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td><img src=\"10.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"11.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"12.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td><img src=\"13.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"14.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"15.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td><img src=\"16.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"17.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"18.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td><img src=\"19.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"21.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"22.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td><img src=\"23.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"24.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><img src=\"25.jpg\" width=\"50\" height=\"50\" alt=\"1\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"tema\" value=\"\" />\n");
      out.write("            <textarea name=\"descripcion\" rows=\"4\" cols=\"20\">\n");
      out.write("            </textarea>\n");
      out.write("            \n");
      out.write("                ");
 ResultSet rs1= con.Consulta("SELECT * FROM \"alumno\""); 
      out.write("\n");
      out.write("            <select name=\"combo2\">\n");
      out.write("                ");
 while(rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=");
 out.print(rs1.getInt(1)); 
      out.write('>');
      out.write(' ');
out.print(rs1.getString(2)); 
      out.write("</option>\n");
      out.write("               \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </select>\n");
      out.write("                ");
 ResultSet rs2= con.Consulta("SELECT * FROM \"nivel\""); 
      out.write("\n");
      out.write("            <select name=\"combo3\">\n");
      out.write("                ");
 while(rs2.next()){
                    
      out.write("\n");
      out.write("                <option value=");
 out.print(rs2.getInt(1)); 
      out.write('>');
      out.write(' ');
out.print(rs2.getString(2)); 
      out.write("</option>\n");
      out.write("                \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </select>\n");
      out.write("                ");
 ResultSet rs3= con.Consulta("SELECT * FROM \"carrera\""); 
      out.write("\n");
      out.write("            <select name=\"combo4\">\n");
      out.write("                ");
 while(rs3.next()){
                    
      out.write("\n");
      out.write("                <option value=");
 out.print(rs3.getInt(1)); 
      out.write('>');
      out.write(' ');
out.print(rs3.getString(2)); 
      out.write("</option>          \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("            <select name=\"imag\">\n");
      out.write("                <option value = \"1.jpg\">1</option>\n");
      out.write("                <option value = \"2.jpg\">2</option>\n");
      out.write("                <option value = \"3.jpg\">3</option>\n");
      out.write("                <option value = \"4.jpg\">4</option>\n");
      out.write("                <option value = \"5.jpg\">5</option>\n");
      out.write("                <option value = \"6.jpg\">6</option>\n");
      out.write("                <option value = \"7.jpg\">7</option>\n");
      out.write("                <option value = \"8.jpg\">8</option>\n");
      out.write("                <option value = \"9.jpg\">9</option>\n");
      out.write("                <option value = \"10.jpg\">10</option>\n");
      out.write("                <option value = \"11.jpg\">11</option>\n");
      out.write("                <option value = \"12.jpg\">12</option>\n");
      out.write("                <option value = \"13.jpg\">13</option>\n");
      out.write("                <option value = \"14.jpg\">14</option>\n");
      out.write("                <option value = \"15.jpg\">15</option>\n");
      out.write("                <option value = \"16.jpg\">16</option>\n");
      out.write("                <option value = \"17.jpg\">17</option>\n");
      out.write("                <option value = \"18.jpg\">18</option>\n");
      out.write("                <option value = \"19.jpg\">19</option>\n");
      out.write("                <option value = \"20.jpg\">20</option>\n");
      out.write("                <option value = \"21.jpg\">21</option>\n");
      out.write("                <option value = \"22.jpg\">22</option>\n");
      out.write("                <option value = \"23.jpg\">23</option>\n");
      out.write("                <option value = \"24jpg\">24</option>\n");
      out.write("                <option value = \"25.jpg\">25</option>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Insertar\" />\n");
      out.write("        </form>\n");
      out.write("            <h1>Ingreso de nuevo comentario </h1>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"ingre_comen.jsp\" method=\"POST\">\n");
      out.write("                ");
 ResultSet rs4= con.Consulta("SELECT carrera.carrera, comentario.idcomentario, comentario.comentario, comentario.idproyecto, comentario.estudiante_comentario, comentario.email, comentario.calificacion FROM carrera, proyecto,comentario WHERE proyecto.idcarrera =" +request.getParameter("combo1")+" and carrera.idcarrera ="+request.getParameter("combo1")+" and comentario.idproyecto = proyecto.idproyecto"); 
      out.write("\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th face=\"Tw Cen MT\"><font color=\"white\"> <font size=10>carrera</th>\n");
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
 while(rs4.next()){
                            
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                           <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getString(1)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getInt(2)); 
      out.write("</td>\n");
      out.write("                           <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getString(3)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getInt(4)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getString(5)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getString(6)); 
      out.write("</td>\n");
      out.write("                            <td face=\"Tw Cen MT\"><font color=\"white\">");
out.print(rs4.getString(7)); 
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("                           <textarea name=\"comentario\" rows=\"4\" cols=\"20\">\n");
      out.write("                        </textarea>\n");
      out.write("                        ");
 ResultSet rs5= con.Consulta("SELECT * FROM \"proyecto\"  WHERE idcarrera="+ request.getParameter("combo1")); 
      out.write("\n");
      out.write("                        <select name=\"combo_com\">\n");
      out.write("                            ");
 while(rs5.next()){
                                
      out.write("\n");
      out.write("                                <option value=");
 out.print(rs5.getInt(1)); 
      out.write('>');
      out.write(' ');
 out.print(rs5.getString(2)); 
      out.write("</option>\n");
      out.write("                            \n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                        <input type=\"text\" name=\"nombre\" value=\"\" />\n");
      out.write("                      \n");
      out.write("                        <input type=\"text\" name=\"email\" value=\"\" />\n");
      out.write("                        <select name=\"combo_cal\">\n");
      out.write("                            <option>A</option>\n");
      out.write("                            <option>B</option>\n");
      out.write("                            <option>C</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"submit\" value=\"ingresar\" />\n");
      out.write("                        \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
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
