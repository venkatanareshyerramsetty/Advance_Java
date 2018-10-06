package Test;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.*;

public class RegServlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		RegBean rb = new RegBean();
		ServletContext sct = req.getServletContext();
		sct.setAttribute("beanRef", rb);
		String uName=req.getParameter("username");
		rb.setUserName(uName);
		String pWord=req.getParameter("password");
		rb.setPassWord(pWord);
		RequestDispatcher rd= req.getRequestDispatcher("Register2.html");
		rd.forward(req, res);
		
	}

}
