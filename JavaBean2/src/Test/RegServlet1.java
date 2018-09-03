package Test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class RegServlet1 extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) 
	throws ServletException, IOException {
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	RegData rd = new RegData();
	String uName = req.getParameter("username");
	String pWord = req.getParameter("password");
	String fName = req.getParameter("fname");
	String lName = req.getParameter("lname");
	
	rd.setName(uName);
	rd.setWord(pWord);
	rd.setFirstName(fName);
	rd.setLastName(lName);
	
	ServletContext sct = req.getServletContext();
	sct.setAttribute("bRef",rd);
	RequestDispatcher rd1 = req.getRequestDispatcher("input2.html");
	rd1.forward(req,res);
	
	}

}
