package org.apache.jsp.WEB_002dINF.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.sql.*;
import javax.sql.*;

public final class hodItemChart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("      \n");
      out.write("\t \n");
      out.write("        ");

           String dnm=request.getParameter("dn"); 
           String cate=request.getParameter("cate"); 
            Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockd1","root","kshirsagar"); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select count(status) from items where status='working' and dept_name="+dnm+" and sub_cat='"+cate+"'");

        
      out.write("\n");
      out.write("    <!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>  \n");
      out.write("<script>\n");
      out.write("window.onload = function () {\n");
      out.write("\n");
      out.write("var chart = new CanvasJS.Chart(\"chartContainer\", {\n");
      out.write("\tanimationEnabled: true,\n");
      out.write("         exportEnabled: true,\n");
      out.write("\ttheme: \"light2\", // \"light1\", \"light2\", \"dark1\", \"dark2\"\n");
      out.write("\ttitle:{\n");
      out.write("\t\ttext: \"Status of working and non working Items\"\n");
      out.write("\t},\n");
      out.write("\taxisY: {\n");
      out.write("\t\ttitle: \"Quantity\"\n");
      out.write("\t},\n");
      out.write("\tdata: [{        \n");
      out.write("\t\ttype: \"column\",  \n");
      out.write("\t\tshowInLegend: true, \n");
      out.write("\t\tlegendMarkerColor: \"grey\",\n");
      out.write("\t\t\n");
      out.write("\t\tdataPoints: [\n");
rs.next();
      out.write("\n");
      out.write("\t\t\t{ y: ");
      out.print(rs.getString(1));
      out.write(", label: \"Working\" },\n");
      out.write("                                ");
ResultSet rs1=st.executeQuery("select count(status) from items where status='not working' and dept_name="+dnm+" and sub_cat='"+cate+"'");rs1.next();
      out.write("\n");
      out.write("                        { y: ");
      out.print(rs1.getString(1));
      out.write(", label: \"Not Working\" },\n");
      out.write("                                 ");
ResultSet rs2=st.executeQuery("select count(status) from items where status='Scrapped' and dept_name="+dnm+" and sub_cat='"+cate+"'");rs2.next();
      out.write("\n");
      out.write("                        { y: ");
      out.print(rs2.getString(1));
      out.write(", label: \"Scrapped\" },\n");
      out.write("                         ");
ResultSet rs3=st.executeQuery("select count(status) from items where status='Transferred' and dept_name="+dnm+" and sub_cat='"+cate+"'");rs3.next();
      out.write("\n");
      out.write("                        { y: ");
      out.print(rs3.getString(1));
      out.write(", label: \"Transferred\" }\n");
      out.write("\t\t\t\n");
      out.write("\t\t]\n");
      out.write("\t}]\n");
      out.write("});\n");
      out.write("chart.render();\n");
      out.write("\n");
      out.write("};\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"chartContainer\" style=\"height: 300px; width: 100%;\"></div>\n");
      out.write("<script src=\"canvasjs.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("    </html>                  ");
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
