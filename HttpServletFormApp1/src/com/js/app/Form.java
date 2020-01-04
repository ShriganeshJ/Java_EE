package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter pw = resp.getWriter();
	
	   //Request get parame and request get parm values 
		formVO fvo = new formVO();
		fvo.setName(req.getParameter("pname"));
		pw.print("name is::"+fvo.getName());
		fvo.setAddress(req.getParameter("addrs"));
		pw.print("address::"+fvo.getAddress());
		fvo.setAge("page");
		pw.print("Age::"+fvo.getAge());
		fvo.setGender(req.getParameterValues("gender"));
		pw.print(fvo.getGender()[0]);
		
		
		
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
