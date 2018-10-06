package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse responce)
	{
		try
		{
			responce.setContentType("text/html");
			PrintWriter out = responce.getWriter();
			String n =request.getParameter("uname");
			out.print("Hello"+n);
			out.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
