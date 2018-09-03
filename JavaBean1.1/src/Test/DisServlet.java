package Test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import java.util.*;


public class DisServlet extends GenericServlet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		ArrayList ref = (ArrayList)req.getAttribute("ref");
		Iterator it = ref.iterator();
		it.forEachRemaining((k)->
		{
			ProductData pd =(ProductData)k;
			pw.println("<br>"+pd.getCode()+"&nbsp"+pd.getName()+"&nbsp"+pd.getPrice());
		});
		
		
	}

}
