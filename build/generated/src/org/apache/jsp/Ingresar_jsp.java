package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import herramientas.conexion;

public final class Ingresar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
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
