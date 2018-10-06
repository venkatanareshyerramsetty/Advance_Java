<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String pCode=request.getParameter("pcode");
   String pName=request.getParameter("pname");
   out.println("the value of ProductCode:"+pCode);
   out.println("the value of the Product Name:"+pName);
 %>

</body>
</html>