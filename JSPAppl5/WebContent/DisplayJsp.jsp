<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=request.getParameter("name");
    int cVal=Integer.parseInt(application.getInitParameter("cVal"));
     int jVal=Integer.parseInt(config.getInitParameter("jVal"));
     out.println("<br> ServerName:"+getServletName());
     out.println("<br> Server Info:"+getServletInfo());
     out.println("<br>Name:"+name);
     out.println("<br>cVal:"+cVal);
     out.println("<br>jVal:"+jVal);%>
</body>
</html>