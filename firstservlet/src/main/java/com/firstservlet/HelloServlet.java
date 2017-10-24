package com.firstservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final String NAME_PARAMETER = "name"; 
	private static final String CONTENT_TYPE = "text\\html";
	private static final String BODY = "Hello";

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter(NAME_PARAMETER);
		response.setContentType(CONTENT_TYPE);
		String responseString = BODY;
		if (null != name)
		{
			responseString += " " + name;
		}
		
		response.getWriter().print(responseString);
	}
}
