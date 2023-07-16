package com.rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet
{

    //handles POST request
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
		{
			int firstnum = Integer.parseInt(request.getParameter("num1"));
			int secondnum = Integer.parseInt(request.getParameter("num2"));
			
			int sum = firstnum+secondnum;
			
			PrintWriter out = response.getWriter();
			out.println("Sum of the numbers is : "+sum);
			
			
		}

    //handles GET request
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
		{
			doPost(request,response);
		}
}
