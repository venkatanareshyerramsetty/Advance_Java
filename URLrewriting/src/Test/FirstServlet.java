package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		try
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			String n=req.getParameter("userName");
			out.print("welcome"+n);
			out.print("<a href='servlet2?uName="+n+"'>visit</a>");
		    out.close();
		}
		catch(Exception e)
		{
			
		}
	}
	

}
