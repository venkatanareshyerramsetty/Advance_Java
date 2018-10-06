package Test;
import java.io.*;
import javax.servlet.*;

public class DisServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		 ServletConfig sc= this.getServletConfig();
		 int cVal = Integer.parseInt(sc.getInitParameter("cName"));
		 pw.println("service name"+sc.getServletName());
		 pw.println("<br> Config val:"+cVal);
	}

}
