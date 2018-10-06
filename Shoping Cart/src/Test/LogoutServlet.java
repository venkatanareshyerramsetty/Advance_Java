package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {

	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
	      
		 HttpSession hs= req.getSession();
		 if(hs!=null)
		 {
			 hs.invalidate();
			 RequestDispatcher rd =req.getRequestDispatcher("login.html");
			 rd.forward(req, res);
		 }
	}
	

}
