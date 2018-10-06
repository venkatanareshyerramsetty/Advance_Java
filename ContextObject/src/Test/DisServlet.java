package Test;
import java.io.*;
import javax.servlet.*;
public class DisServlet extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		ServletContext set = req.getServletContext();
		int cVat=Integer.parseInt(set.getInitParameter("cName"));
		pw.println("server info:"+set.getServerInfo());
		pw.println("<br>Context val:"+cVat);
	
	}
	

}
