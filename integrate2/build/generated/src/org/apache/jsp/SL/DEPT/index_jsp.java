package org.apache.jsp.SL.DEPT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"overflow:hidden;\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Login Stock</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/dummy.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../View/view.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("h1\r\n");
      out.write("{\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-weight:normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-8\r\n");
      out.write("{\r\n");
      out.write("    font-family: 'Open Sans Condensed', arial, sans;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    background: #FFFFFF;\r\n");
      out.write("    margin: 50px auto;\r\n");
      out.write("    box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);\r\n");
      out.write("    -moz-box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);\r\n");
      out.write("    -webkit-box-shadow:  0px 0px 15px rgba(0, 0, 0, 0.22);\r\n");
      out.write("}\r\n");
      out.write(".topnav \r\n");
      out.write("{\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: dodgerblue;\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a \r\n");
      out.write("{\r\n");
      out.write("  float: left;\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding-top: 20px;\r\n");
      out.write("  padding-bottom:20px;\r\n");
      out.write("  padding-left: 6px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".topnav .icon \r\n");
      out.write("{\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write(".form-style-8 h2\r\n");
      out.write("{\r\n");
      out.write("    background: #4D4D4D;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-family: 'Open Sans Condensed', sans-serif;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    margin: -30px -30px 30px -30px;\r\n");
      out.write("}\r\n");
      out.write(".form-style-8 input[type=\"text\"],\r\n");
      out.write(".form-style-8 input[type=\"password\"],\r\n");
      out.write(".form-style-8 select \r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    -webkit-box-sizing: border-box;\r\n");
      out.write("    -moz-box-sizing: border-box;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding: 7px;\r\n");
      out.write("    padding-top: 0px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-color: #555;\r\n");
      out.write("    border-bottom: 1px solid grey;\r\n");
      out.write("    border-right:  1px solid grey; \r\n");
      out.write("    background: transparent;\r\n");
      out.write("    \tmargin-top: 10px;\r\n");
      out.write("\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    font: 16px Arial, Helvetica, sans-serif;\r\n");
      out.write("    height: 45px;\r\n");
      out.write("}\r\n");
      out.write("form label\r\n");
      out.write("{\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("        float: left;\r\n");
      out.write("        display:inline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-8 input[type=\"button\"], \r\n");
      out.write(".form-style-8 input[type=\"submit\"]{\r\n");
      out.write("    -moz-box-shadow: inset 0px 1px 0px 0px #45D6D6;\r\n");
      out.write("    -webkit-box-shadow: inset 0px 1px 0px 0px #45D6D6;\r\n");
      out.write("    box-shadow: inset 0px 1px 0px 0px #4CAF50;\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    border: 1px solid #4CAF50;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("    font-family: 'Open Sans Condensed', sans-serif;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    padding: 8px 20px;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    float: right;\r\n");
      out.write("}\r\n");
      out.write(".form-style-8 input[type=\"Reset\"], \r\n");
      out.write(".form-style-8 input[type=\"Reset\"]{\r\n");
      out.write("    -moz-box-shadow: inset 0px 1px 0px 0px #45D6D6;\r\n");
      out.write("    -webkit-box-shadow: inset 0px 1px 0px 0px #45D6D6;\r\n");
      out.write("    box-shadow: inset 0px 1px 0px 0px tomato;\r\n");
      out.write("    background-color: tomato;\r\n");
      out.write("    border: 1px solid tomato;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("    font-family: 'Open Sans Condensed', sans-serif;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    padding: 8px 20px;\r\n");
      out.write("    margin-left: 10px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    float: right;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background:none;\">\t\r\n");
      out.write("\t<div class=\"limiter\">\t\r\n");
      out.write("\t\t<div class=\"container-login1001\">\r\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\r\n");
      out.write("                            <div class=\"login100-form-title\" style=\"background-image: url(../../images/bg-01.jpg);\">\r\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title-1\">\r\n");
      out.write("\t\t\t\t\t\t<center>ADD&nbsp;&nbsp;DEPARTMENT<center>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                            <div class=\"form-style-8\">\r\n");
      out.write("   <form action=\"addcat.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" method=\"post\">\r\n");
      out.write("      ");

    if(null!=request.getAttribute("errorMessage"))
    {
      out.write("\r\n");
      out.write("         <h3>");
      out.print(request.getAttribute("errorMessage") );
      out.write("</h3>");

    }

      out.write("\r\n");
      out.write("        <label>Dept Id :</label>\r\n");
      out.write("    <input type=\"text\" name=\"did\" placeholder=\"Dept ID\" required/>\r\n");
      out.write("    <br><br><br><br>\r\n");
      out.write("    <label>Dept Name :</label>\r\n");
      out.write("    <input type=\"text\" name=\"dname\" placeholder=\"Dept Name\" required/>\r\n");
      out.write("    <br><br><br><br>\r\n");
      out.write("<input type=\"submit\" value=\"Submit\" />      \r\n");
      out.write("<input type=\"Reset\" value=\"Reset\" />\r\n");
      out.write("<br><br>\r\n");
      out.write("</div>\r\n");
      out.write("</form>                           </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
