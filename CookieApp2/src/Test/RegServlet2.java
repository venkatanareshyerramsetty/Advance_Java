package Test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegServlet2 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		ServletContext sct = req.getServletContext();
		RegBean rb = (RegBean)sct.getAttribute("beanRef");
		String fName= req.getParameter("firstname");
		rb.setFirstName(fName);
		String lName = req.getParameter("lastname");
		rb.setLastName(lName);
		String addr = req.getParameter("address");
		rb.setAddress(addr);
		RequestDispatcher rd = req.getRequestDispatcher("Register3.html");
		rd.forward(req, res);
	}
	

}
