<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int f1=Integer.parseInt(request.getParameter("field1"));
int f2=Integer.parseInt(request.getParameter("field2"));
int result=f1+f2;
%>
<jsp:forward page="/Result.jsp">
<jsp:param value="<%=result %>" name="result"/>
</jsp:forward>
</body>
</html>