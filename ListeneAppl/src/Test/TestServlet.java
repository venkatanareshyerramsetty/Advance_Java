package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet {

	
	public void service(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
       
		HttpSession hs=req.getSession();
		String submit =req.getParameter("submit");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		 if(submit.equals("Add"))
		   {
			   hs.setAttribute(req.getParameter("name"), req.getParameter("value"));
			   out.println("Attribute added<br/>");   
		   }
		 
		 else if(submit.equals("Remove"))
		 {
			 hs.removeAttribute(req.getParameter("name"));
			 out.println("Attribute Removed <br/>");
		 }
		 RequestDispatcher rd = req.getRequestDispatcher("home.html");
		 rd.include(req, res);
	}
	  

}
