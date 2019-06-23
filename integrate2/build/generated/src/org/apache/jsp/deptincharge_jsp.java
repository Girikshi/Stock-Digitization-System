package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deptincharge_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"overflow:hidden;\">\n");
      out.write("    <head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/lablayout.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    </head>\n");
      out.write("<body style=\"background-image:url('images/campbg3.jpg'); overflow-y: hidden\">\n");
      out.write("<div class=\"main\">\n");
      out.write("    <div style=\"height:20%\"><br>\n");
      out.write("        <h1><center><b>PUNE INSTITUTE OF COMPUTER TECHNOLOGY</b></center></h1>\n");
      out.write("    </div><div style=\"height:75%\">\n");
      out.write("     <ul class=\"breadcrumb\" style=\"background-color:#3db2e1;height:10%; border-radius: 0px; border: 1px solid transparent;\">\n");
      out.write("    <li style=\"font-size:17px\"><a href=\"#\" style=\"color:white;\">Home</a></li>\n");
      out.write("     <li style=\"font-size:17px;float: right;\"><a href=\"http://localhost:8080/integrate2/index.jsp\" style=\"color:white;\">LogOut</a></li>\n");
      out.write("\n");
      out.write("    </ul><div style=\"height:100%;\">\n");
      out.write("        <iframe height=\"480\" style=\"width:82%\" src=\"index_1.html?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" align=\"right\" frameborder = \"0\"   name = \"Main\" allowtransparency=\"true\">\n");
      out.write("        </iframe></div>\t\t\n");
      out.write("        <div style=\"height:100%\">\n");
      out.write("    <nav class=\"navigation\"  style=\"background-color:none transparent;\">\n");
      out.write("    <ul class=\"mainmenu\" style=\"background-color:white;border-radius: 30px; border: 1px solid transparent;\n");
      out.write("    outline-style: outset;\n");
      out.write("    outline-color: transparent;\">\n");
      out.write(" \n");
      out.write("    <li style=\"font-size: 17px;margin-top: 15px;\"><a href=\"\" style=\"background-color:transparent;color:darkblue\"><i class=\"fa fa-fw fa-user\"></i>My Profile</a>\n");
      out.write("      <ul class=\"submenu\">\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"profile/Myprofile.jsp\" target = \"Main\">View Profile</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"profile/updateprofile.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Update Profile</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li style=\"font-size: 17px;\"><a href=\"\" style=\"background-color:transparent;color:darkblue\"><i class=\"fa fa-fw fa-user\"></i> Users</a>\n");
      out.write("      <ul class=\"submenu\">\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/addla.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Add</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/updatela.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Update</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/deluser.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Delete</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li style=\"font-size: 17px;\"><a href=\"\" style=\"background-color:transparent;color:darkblue\"><i class=\"fa fa-fw fa-user\"></i> Laboratory</a>\n");
      out.write("      <ul class=\"submenu\">\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/addlab.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Add</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/updatelab.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Update</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li style=\"font-size: 17px;\"><a href=\"\" style=\"background-color:transparent;color:darkblue\"><i class=\"fa fa-fw fa-user\"></i> Item Category</a>\n");
      out.write("      <ul class=\"submenu\">\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/CAT/index.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Add</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"DEPTF/CAT/updatecath.jsp?demo=");
      out.print(request.getParameter("demo"));
      out.write("&dn=");
      out.print(request.getParameter("dn"));
      out.write("&useri=");
      out.print(request.getParameter("useri"));
      out.write("\" target = \"Main\">Update</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li> \n");
      out.write("    <li style=\"font-size: 17px;\"><a href=\"\" style=\"background-color:transparent;color:darkblue\"><i class=\"fa fa-file-text\"></i> Generate report</a>\n");
      out.write("      <ul class=\"submenu\">\n");
      out.write("         <li style=\"font-size: 15px;\"><a href=\"View/priItem.jsp\"  target = \"Main\">Item wise</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"View/priLab.jsp\"  target = \"Main\">Lab wise</a></li>\n");
      out.write("        <li style=\"font-size: 15px;\"><a href=\"View/priDept.jsp\"  target = \"Main\">Department wise</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    </ul>  \n");
      out.write("    </nav>  \n");
      out.write("      <!--\n");
      out.write("    <li style=\"font-size:17px\"><a href=\"\" style=\"background-color:transparent;color:darkblue;\"><i class=\"fa fa-file-text\"></i> Repair ( Item ) </a>\n");
      out.write("      <ul class=\"submenu\">\n");
      out.write("        <li style=\"font-size:15px\"><a href=\"repair1/repairs.jsp?demo= target = \"Main\"> Send ( Item ) </a></li>\n");
      out.write("        <li style=\"font-size:15px\"><a href=\"repair1/repairr.jsp?demo= target = \"Main\"> Receive ( Item ) </a></li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html> \n");
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
