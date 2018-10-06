<%@ page errorPage="Registration.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form
 {
	background-color: yellow;
	padding: 20px 60px;
	border: 6px solid blue;
	width: 250px
 }
</style>
</head>
<body>
<jsp:useBean id="regForm" class="bean.RegForm" scope="session"/>
<%--this is the JSP action tag used to declare bean --%>
<jsp:setProperty name="regForm" property="*"/>
<form action="RegisterProcessFinal.jsp"><pre><b>
FirstName:<input type="text" name="first_name"/>
LastName:<input type="text" name="last_name"/>
Address:<input type="text" name="address"/>
<input type="submit" value="Register"/>
</b></pre></form>
</body>
</html>