<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="overflow:hidden;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> INSERT </title>
</head>
<body>
<%


String dsrno=request.getParameter("dsrno");
String demo=request.getParameter("demo");
String dn=request.getParameter("dn");

String sd=request.getParameter("sd");

StringBuffer rmk = null;
rmk = new StringBuffer(request.getParameter("rmk"));



Class.forName("com.mysql.jdbc.Driver");
try
{
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockd2","root","root");
Statement st= con.createStatement();
ResultSet rs;

rs=st.executeQuery("select * from items join labs on(items.lab_id=labs.lab_id) where dsrno='"+dsrno+"' and labs.lab_id="+demo+" and labs.dept_name="+dn+" ");
if(rs.next())
{
int i=st.executeUpdate("update maintainance set remark='"+rmk+"',received_rep='"+sd+"' where dsr_no='"+dsrno+"'");

%>
<script> alert("Record added");
window.location.href = "http://localhost:8080/integrate/indexadmin.html";</script>
<%
}
else
{
   %>
<script> alert("Match not Found");
window.location.href = "http://localhost:8080/integrate/indexadmin.html";</script>
<%     
        }
        }
catch(Exception e)
{
	out.println(e);
}
%>
</body>
</html>