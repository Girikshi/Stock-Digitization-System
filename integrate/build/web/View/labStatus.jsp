
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login Stock</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../css/util.css">
	<link rel="stylesheet" type="text/css" href="../css/dummy.css">
        <link rel="stylesheet" type="text/css" href="view.css">
<!--===============================================================================================-->

<style>

h1
{
    font-size:20px;
    text-decoration: none;
    font-weight:normal;
}


</style>
<script>
    function handleClick1( form )
{
     if ( ( form.radio[0].checked == false ) && ( form.radio[1].checked == false ) && ( form.radio[2].checked == false ) && ( form.radio[3].checked == false )  )
    {
        alert ( "Please choose the item status." );
        form.action = "#?demo=<%=request.getParameter("demo")%>&dn=<%=request.getParameter("dn")%>&useri=<%=request.getParameter("useri")%>";
        form.target="Main";
    }
    else
    {
        form.action = "labPDF2.jsp?demo=<%=request.getParameter("demo")%>&dn=<%=request.getParameter("dn")%>&useri=<%=request.getParameter("useri")%>";
        form.target="_blank";
        form.submit();
    }
}
    function handleClick2( form )
{
form.action = "labChart2.jsp?demo=<%=request.getParameter("demo")%>&dn=<%=request.getParameter("dn")%>&useri=<%=request.getParameter("useri")%>";
form.target="_blank";
form.submit();
}
    </script>

</head>
<body style="background:none;">	
	<div class="limiter">	
		<div class="container-login1001">
			<div class="wrap-login100">
                            <div class="login100-form-title" style="background-image: url(../images/bg-01.jpg);">
					<span class="login100-form-title-1">
					<center>Generate &nbspStatus &nbspwise &nbspReports &nbspfor &nbsplab <%=request.getParameter("demo")%><center>
					</span>
				</div>
                            <div class="form-style-8">
                                <%
//String userid=request.getParameter("demo"); 
//String dn=request.getParameter("dn");
%>
 
<form name="f1" method="POST" >
   
    <h3>Select item status: <input type='submit' style="background-color:crimson; border:none"   value='Overall Graph' onclick=handleClick2(this.form)></h3>
    <label class="container">Working
  <input type="radio"   name="radio" value="working">
  <span class="checkmark"></span>
</label>
    <label class="container">Not Working
  <input type="radio" name="radio" value="not working">
  <span class="checkmark"></span>
</label>
    <label class="container">Scrapped
  <input type="radio" name="radio" value="scrapped">
  <span class="checkmark"></span>
</label>
    
     <label class="container">Transferred
  <input type="radio" name="radio" value="transferred">
  <span class="checkmark"></span>
</label>

        <input type='submit' value='PDF' onclick=handleClick1(this.form)>
        
        <input type="Reset" value="Reset" />
        <br><br>
</form>
                            </div>
			</div>
		</div>
	</div>
</body>
</html>
