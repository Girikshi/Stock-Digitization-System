<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
if(request.getParameter("type")!=null) 
{
    String id=request.getParameter("type"); //get country_id from index.jsp page with function country_change() through ajax and store in id variable
        
    try
    {
        Class.forName("com.mysql.jdbc.Driver"); //load driver
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockd2","root","root"); //create connection
            
        PreparedStatement pstmt=null ; //create statement
                
        pstmt=con.prepareStatement("select distinct type from category where sub_cat=? "); //sql select query
        pstmt.setString(1,id);
        ResultSet rs=pstmt.executeQuery(); //execute query and set in resultset object rs.
        %>        
        <option selected="selected" value="9999">--Select labs--</option>
        <%    
        while(rs.next())
        {
        %>        
            <option value="<%=rs.getString("type")%>">
                <%=rs.getString("type")%>
            </option>
        <%
        }
		
        con.close(); //close connection
    }
    catch(Exception e)
    {
        out.println(e);
    }
}
%>


        