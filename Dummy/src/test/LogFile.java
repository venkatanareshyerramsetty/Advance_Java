package test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LogFile extends GenericServlet{

	public void init()
			throws ServletException
			{
				
			}

			public void service(ServletRequest req,ServletResponse res)
			throws ServletException,IOException
			{
				PrintWriter pw = res.getWriter();
				res.setContentType("text/html");
				

				FileInputStream inputStream = null;
				Scanner sc = null;
				try {
				    inputStream = new FileInputStream("/WEB-INF/logFile.2015-09-10.log");
				    sc = new Scanner(inputStream, "UTF-8");
				    while (sc.hasNextLine()) {
				        String line = sc.nextLine();
				        System.out.println(line);
				    }
				    // note that Scanner suppresses exceptions
				    if (sc.ioException() != null) {
				        throw sc.ioException();
				    }
				} 
				
				finally {
				    if (inputStream != null) {
				    	
				    		inputStream.close();
				        }
				    if (sc != null) {
				        sc.close();
				       }
			    }
				
				
				
				
				
			}
			
			public void distroy()
			{
				
			}
			
}
