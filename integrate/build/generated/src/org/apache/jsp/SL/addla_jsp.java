package org.apache.jsp.SL;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" style=\"overflow: hidden\">\n");
      out.write("<head>\n");
      out.write("\t<title>Login Stock</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/dummy.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../View/view.css\">\n");
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
      out.write(".form-style-8\n");
      out.write("{\n");
      out.write("    font-family: 'Open Sans Condensed', arial, sans;\n");
      out.write("    width: 800px;\n");
      out.write("    padding: 30px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    margin: 50px auto;\n");
      out.write("    box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);\n");
      out.write("    -moz-box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);\n");
      out.write("    -webkit-box-shadow:  0px 0px 15px rgba(0, 0, 0, 0.22);\n");
      out.write("}\n");
      out.write(".topnav \n");
      out.write("{\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: dodgerblue;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a \n");
      out.write("{\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding-top: 20px;\n");
      out.write("  padding-bottom:20px;\n");
      out.write("  padding-left: 6px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".topnav .icon \n");
      out.write("{\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".form-style-8 h2\n");
      out.write("{\n");
      out.write("    background: #4D4D4D;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    font-family: 'Open Sans Condensed', sans-serif;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: 100;\n");
      out.write("    padding: 20px;\n");
      out.write("    margin: -30px -30px 30px -30px;\n");
      out.write("}\n");
      out.write(".form-style-8 input[type=\"text\"],\n");
      out.write(".form-style-8 input[type=\"password\"],\n");
      out.write(".form-style-8 select \n");
      out.write("\n");
      out.write("{\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    -webkit-box-sizing: border-box;\n");
      out.write("    -moz-box-sizing: border-box;\n");
      out.write("    outline: none;\n");
      out.write("    display: block;\n");
      out.write("    width: 60%;\n");
      out.write("    float: right;\n");
      out.write("    padding: 7px;\n");
      out.write("    padding-top: 0px;\n");
      out.write("    border: none;\n");
      out.write("    border-color: #555;\n");
      out.write("    border-bottom: 1px solid grey;\n");
      out.write("    border-right:  1px solid grey; \n");
      out.write("    background: transparent;\n");
      out.write("    \tmargin-top: 10px;\n");
      out.write("\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    font: 16px Arial, Helvetica, sans-serif;\n");
      out.write("    height: 45px;\n");
      out.write("}\n");
      out.write("form label\n");
      out.write("{\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tpadding-top: 10px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("        float: left;\n");
      out.write("        display:inline;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-style-8 input[type=\"button\"], \n");
      out.write(".form-style-8 input[type=\"submit\"]{\n");
      out.write("    -moz-box-shadow: inset 0px 1px 0px 0px #45D6D6;\n");
      out.write("    -webkit-box-shadow: inset 0px 1px 0px 0px #45D6D6;\n");
      out.write("    box-shadow: inset 0px 1px 0px 0px #4CAF50;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    border: 1px solid #4CAF50;\n");
      out.write("    display: inline-block;\n");
      out.write("    cursor: pointer;\n");
      out.write("    color: #FFFFFF;\n");
      out.write("    font-family: 'Open Sans Condensed', sans-serif;\n");
      out.write("    font-size: 16px;\n");
      out.write("    padding: 8px 20px;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write(".form-style-8 input[type=\"Reset\"], \n");
      out.write(".form-style-8 input[type=\"Reset\"]{\n");
      out.write("    -moz-box-shadow: inset 0px 1px 0px 0px #45D6D6;\n");
      out.write("    -webkit-box-shadow: inset 0px 1px 0px 0px #45D6D6;\n");
      out.write("    box-shadow: inset 0px 1px 0px 0px tomato;\n");
      out.write("    background-color: tomato;\n");
      out.write("    border: 1px solid tomato;\n");
      out.write("    display: inline-block;\n");
      out.write("    cursor: pointer;\n");
      out.write("    color: #FFFFFF;\n");
      out.write("    font-family: 'Open Sans Condensed', sans-serif;\n");
      out.write("    font-size: 16px;\n");
      out.write("    padding: 8px 20px;\n");
      out.write("    margin-left: 10px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    float: right;\n");
      out.write("    margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-1.12.4.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function country_change()\n");
      out.write("{\n");
      out.write("    var country = $(\".country\").val();\n");
      out.write("\t\n");
      out.write("    $.ajax({\n");
      out.write("\t\ttype: \"POST\",\n");
      out.write("\t\turl: \"state.jsp\",\n");
      out.write("\t\tdata: \"dept_name=\"+country,\n");
      out.write("\t\tcache: false,\n");
      out.write("\t\tsuccess: function(response)\n");
      out.write("        {\n");
      out.write("            $(\".state\").html(response);\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background:none;\">\t\n");
      out.write("\t<div class=\"limiter\">\t\n");
      out.write("\t\t<div class=\"container-login1001\">\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\n");
      out.write("                            <div class=\"login100-form-title\" style=\"background-image: url(../images/bg-01.jpg);\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title-1\">\n");
      out.write("\t\t\t\t\t\t<center>ADD&nbsp;&nbsp;USER<center>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            <div class=\"form-style-8\">\n");
      out.write("        ");

String userid=request.getParameter("demo"); 
String dn=request.getParameter("dn");

      out.write("\n");
      out.write("  <form action=\"addlas.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" method=\"post\">\n");
      out.write("\t<label>UserId :</label>\n");
      out.write("           <input type=\"text\" name=\"uid\" placeholder=\"User ID\" required/>\n");
      out.write("        <br><br><br><br>\n");
      out.write("\t<label>Category :</label>\n");
      out.write("            <select id = \"myList\" name=\"cat\">\n");
      out.write("        <option selected=\"selected\" value = \"9999\">Select Category</option>\n");
      out.write("               <option value = \"Lab Assistent\">Department Incharge</option>\n");
      out.write("               <option value = \"Lab Incharge\">Lab Assistent</option>\n");
      out.write("                              <option value = \"Lab Incharge\">Lab Incharge</option>\n");
      out.write("                   <option value = \"Lab Assistent\">HOD</option>\n");
      out.write("               <option value = \"Lab Incharge\">Principal</option>\n");
      out.write("            </select>\n");
      out.write("        <br><br><br><br>\n");
      out.write("\t<label>Department :</label> \n");
      out.write("    <select class=\"country\" onchange=\"country_change()\" name=\"category\">\n");
      out.write("               <option selected=\"selected\" value=\"9999\">Select Department</option>\n");
      out.write("    \n");
      out.write("    ");

    try
    {
        Class.forName("com.mysql.jdbc.Driver"); //load driver
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockd2","root","root"); //create connection
                
        PreparedStatement pstmt=null ; //create statement
                
        pstmt=con.prepareStatement("select dept_name from dept"); //sql select query
        ResultSet rs=pstmt.executeQuery(); //execute query and set in resultset object rs.
                
        while(rs.next())
        {
        
      out.write("\n");
      out.write("            <option value=\"");
      out.print(rs.getString("dept_name"));
      out.write("\">\n");
      out.write("                ");
      out.print(rs.getString("dept_name"));
      out.write("\n");
      out.write("            </option>\n");
      out.write("        ");

        }
           
        con.close(); //close connection
    }
    catch(Exception e)
    {
        out.println(e);
    }
    
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <br><br><br><br>\n");
      out.write("\n");
      out.write("    <label>Lab :</label> \n");
      out.write("        <select class=\"state\"  name=\"subcategory\">\n");
      out.write("    <option selected=\"selected\" value=\"9999\">Select Lab</option>\n");
      out.write("    </select>        <br><br><br><br>\n");
      out.write(" <label>Username :</label>\n");
      out.write("    <input type=\"text\" name=\"uname\" placeholder=\"Username\" required/>\n");
      out.write("    <br><br><br><br>\n");
      out.write("    <label>Password :</label>\n");
      out.write("    <input type=\"Password\" name=\"pwd\" placeholder=\"Password\" required/>\n");
      out.write("    <br><br><br><br>\n");
      out.write("       <input type=\"submit\" value=\"Submit\" />       \n");
      out.write("        <input type=\"Reset\" value=\"Reset\" />\n");
      out.write("        <br><br>\n");
      out.write("</form>                       </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
