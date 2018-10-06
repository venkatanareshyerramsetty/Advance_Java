<%@ page errorPage="Registration.html"%>
<jsp:useBean id="regForm" type="bean.RegForm" scope="session"/>
<jsp:setProperty property="firstName" param="first_name" name="regForm"/>
<jsp:setProperty property="lastName" param="last_name" name="regForm"/>
<jsp:setProperty property="address" name="regForm"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><pre>
Your Registration details are valid
<a href="ViewRegistrationDetails.jsp">Click</a>to view Registration Details and Conform
</pre>
</body>
</html>