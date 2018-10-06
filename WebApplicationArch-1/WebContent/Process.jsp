<%@page import="bean.RegisterDao"%>
<jsp:useBean id="regForm" type="bean.RegForm" scope="session"/>

<%
int status=RegisterDao.register(regForm);
if(status>0)
  out.println("you are Successfully registered");
%>
