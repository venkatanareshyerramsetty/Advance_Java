package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse responce)
			throws ServletException,IOException
	    {
		   responce.setContentType("text/html");
		   PrintWriter out =responce.getWriter();
		   request.getRequestDispatcher("index.html").include(request,responce);
	       Cookie ck1=new Cookie("name","");
	       ck1.setMaxAge(0);
	       Cookie ck2=new Cookie("pass","");
	       ck2.setMaxAge(0);
	       responce.addCookie(ck2);
	       
	       out.println("<br> you are Suuccessfully Logged out ");
	    }

}
