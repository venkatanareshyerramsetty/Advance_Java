package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;

public class RegServlet3 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		ServletContext sct = req.getServletContext();
		RegBean rb =(RegBean)sct.getAttribute("beanRef");
		String phNo=req.getParameter("phno");
		rb.setphoneNo(phNo);
		String mid=req.getParameter("mailid");
		rb.setMailId(mid);
		RequestDispatcher rd = req.getRequestDispatcher("final.html");
		rd.forward(req, res);
		
	}

}
