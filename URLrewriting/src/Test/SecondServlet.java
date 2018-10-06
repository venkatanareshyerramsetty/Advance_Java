package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		try
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			String n=req.getParameter("uName");
			out.print("Hello"+n);
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	

}
