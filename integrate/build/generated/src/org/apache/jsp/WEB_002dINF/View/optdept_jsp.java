package org.apache.jsp.WEB_002dINF.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class optdept_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Login Stock</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/dummy.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("    font-size:20px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-weight:normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    function handleClick1( form )\n");
      out.write("{\n");
      out.write("form.action = \"deptpdf.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\";\n");
      out.write("form.target=\"_blank\";\n");
      out.write("form.submit();\n");
      out.write("}\n");
      out.write("    function handleClick2( form )\n");
      out.write("{\n");
      out.write("form.action = \"hoddeptChart.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\";\n");
      out.write("form.target=\"_blank\";\n");
      out.write("form.submit();\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background:none;\">\t\n");
      out.write("\t<div class=\"limiter\">\t\n");
      out.write("\t\t<div class=\"container-login1001\">\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\n");
      out.write("                            <div class=\"login100-form-title\" style=\"background-image: url(../images/bg-01.jpg);\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title-1\">\n");
      out.write("\t\t\t\t\t<center>Generate Status wise Reports for department ");
      out.print(request.getParameter("dn"));
      out.write("<center>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            <div class=\"form-style-8\">\n");
      out.write("                                ");

//

      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<form name=\"f1\" method=\"POST\"  >\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <h3>Select item status: <input type='submit' style=\"background-color:crimson; border:none\"   value='Overall Graph' onclick=handleClick2(this.form)>\n");
      out.write("</h3>\n");
      out.write("    <label class=\"container\">Working\n");
      out.write("  <input type=\"radio\" checked=\"checked\"   name=\"radio\" value=\"working\">\n");
      out.write("  <span class=\"checkmark\"></span>\n");
      out.write("</label>\n");
      out.write("    <label class=\"container\">Not Working\n");
      out.write("  <input type=\"radio\" name=\"radio\" value=\"not working\">\n");
      out.write("  <span class=\"checkmark\"></span>\n");
      out.write("</label>\n");
      out.write("    <label class=\"container\">Scrapped\n");
      out.write("  <input type=\"radio\" name=\"radio\" value=\"scrapped\">\n");
      out.write("  <span class=\"checkmark\"></span>\n");
      out.write("</label>\n");
      out.write("    \n");
      out.write("     <label class=\"container\">Transferred\n");
      out.write("  <input type=\"radio\" name=\"radio\" value=\"transferred\">\n");
      out.write("  <span class=\"checkmark\"></span>\n");
      out.write("</label>\n");
      out.write("\n");
      out.write("        <input type='submit' value='PDF' onclick=handleClick1(this.form)>\n");
      out.write("      \n");
      out.write("        <input type=\"Reset\" value=\"Reset\" />\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("</form>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
