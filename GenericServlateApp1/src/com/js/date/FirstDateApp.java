package com.js.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstDateApp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		Date d = new Date();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1> Date Is::"+d);
		pw.println("</h1>");
		pw.println("</body>");
		pw.println("</html>");
		
		pw.close();
		
		
		
		
	}

}
