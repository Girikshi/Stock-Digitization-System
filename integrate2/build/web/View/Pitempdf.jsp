<%@page import="com.itextpdf.text.Rectangle"%>
<%@page import="com.itextpdf.text.Phrase"%>
<%@page import="com.itextpdf.text.BaseColor"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>

<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="com.itextpdf.text.Image"%>
<%@page import="com.itextpdf.text.Image"%>
<%@page import="com.itextpdf.text.Font"%>
<%@page import="com.itextpdf.text.Element"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.pdf.*"%>
<%@page import="java.time.format.DateTimeFormatter"%>  
<%@page import="java.time.LocalDateTime"%>    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Itemwise PDF</title>
</head>
<body>
<%
response.setContentType("application/pdf");
Document document = new Document();
PdfWriter writer=PdfWriter.getInstance(document, response.getOutputStream());
Rectangle two = new Rectangle(700,800);
document.setPageSize(two);
Font f1 = new Font();
f1.setStyle(Font.BOLD);
f1.setSize(15);
document.open();
Paragraph p = new Paragraph();
p.add("Deadstock Report");
p.setAlignment(Element.ALIGN_CENTER);
document.add(p);
Paragraph p2 = new Paragraph();
Paragraph p5 = new Paragraph();
p5.setAlignment(Element.ALIGN_RIGHT);
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now(); 
   p5.add("Date:");
 p5.add(dtf.format(now));
document.add(p5);
String cate=request.getParameter("cate"); 
String stat=request.getParameter("radio"); 
Font f = new Font();
f.setStyle(Font.BOLD);
f.setSize(8);
f.setColor(BaseColor.WHITE);
p2.add("Department wise report for category "); //no alignment
p2.add(cate+"\n"+" Status:"+stat);
p2.setAlignment(Element.ALIGN_CENTER);
document.add(p2);
Paragraph p3 = new Paragraph();
p3.add("\n");
document.add(p3);
//document.add(new Paragraph("This is my paragraph 3", f));

 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockd2","root",""); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("SELECT items.sub_cat,specification.spec,specification.mech, items.dsrno,items.qty,items.status,"
        + "items.extra,items.dept_name,items.lab_id FROM items INNER JOIN specification "
        + "ON items.type = specification.type where items.sub_cat='"+cate+"' and items.status='"+stat+"'"); 
PdfPTable table = new PdfPTable(new float[] { 2, 2, 3 ,3,2,1,2,2,3,3});
table.setWidthPercentage(100);
	 table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
	  table.addCell(new Phrase("Sr.No",f));
          table.addCell(new Phrase("Item Name",f));
          table.addCell(new Phrase("Configuration",f));
           table.addCell(new Phrase("Specification",f));
          table.addCell(new Phrase("DSR No",f));
          table.addCell(new Phrase("Qty",f));
          table.addCell(new Phrase("Status",f));
         table.addCell(new Phrase("Lab Name",f));
          table.addCell(new Phrase("Department Name",f));
           table.addCell(new Phrase("Remarks",f));
	  table.setHeaderRows(1);
	  PdfPCell[] cells = table.getRow(0).getCells(); 
	  for (int j=0;j<cells.length;j++){
	     cells[j].setBackgroundColor(BaseColor.GRAY);
             
	  }
          int i=1;
           if (rs.next() == false) 
         {
                    Paragraph p9 = new Paragraph();
                    p9.setAlignment(Element.ALIGN_CENTER);
                    p9.add(new Phrase("\nNo any Exsisting record of this type.",f1));
                    document.add(p9);
      } else {
          do
          { 
              table.addCell(Integer.toString(i));
              table.addCell(rs.getString(1));
              table.addCell(rs.getString(2));
              table.addCell(rs.getString(3));
              table.addCell(rs.getString(4));
              table.addCell(rs.getString(5));
              table.addCell(rs.getString(6));
             table.addCell(rs.getString(9));
              table.addCell(rs.getString(8));
              table.addCell(rs.getString(7));
             
              i++;
          }while(rs.next());
 document.add(table);
          }       
Paragraph p4 = new Paragraph();
p4.setAlignment(Element.ALIGN_LEFT);
p4.add("\n\nName and Sign of\n Stock verification\ncomitee members");
document.add(p4);
document.close();
%>
</body>
</html>
