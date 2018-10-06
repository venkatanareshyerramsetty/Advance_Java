<%@ page import="java.sql.*,Test.DBconnection" errorPage="/MyError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Connection con=DBconnection.getCon();
PreparedStatement ps=con.prepareStatement("select* from registration9 where uname=? and pword=?");
String uName=request.getParameter("username");
String pWord=request.getParameter("password");
ps.setString(1, uName);
ps.setString(2, pWord);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
	out.println("Welcome sir"  +uName);
}
else{
	out.println("Invalid user");
%> 
<%@ include file="login.html" %>
<% } %>

</body>
</html>