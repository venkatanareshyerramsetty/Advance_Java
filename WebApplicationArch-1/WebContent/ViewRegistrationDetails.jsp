<jsp:useBean id="regForm" type="bean.RegForm" scope="session"/>
<%@ page errorPage="Registration.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><pre>
<b>UserName:</b><jsp:getProperty property="userName" name="regForm"/>
<b>PassWord:</b><jsp:getProperty property="password" name="regForm"/>
<b>Email id:</b><jsp:getProperty property="email" name="regForm"/>
<b>FirstName:</b><jsp:getProperty property="firstName" name="regForm"/>
<b>LastName:</b><jsp:getProperty property="lastName" name="regForm"/>
<b>Address:</b><jsp:getProperty property="address" name="regForm"/>
</pre>
<form action="Process.jsp">
<input type="submit" value="Register"/>
</form>
</body>
</html>