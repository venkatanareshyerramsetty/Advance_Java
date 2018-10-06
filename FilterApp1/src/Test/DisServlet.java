package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("type/html");
		String uName=req.getParameter("uname");
		pw.println("<br> Login Successfull");
		pw.println("<br>Welcome"+uName);
		
	}
	

}
