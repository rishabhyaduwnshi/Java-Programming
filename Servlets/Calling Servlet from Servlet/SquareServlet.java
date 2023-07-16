package com.rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int sum = (int)request.getAttribute("sum");
		sum = sum*sum;
		PrintWriter out = response.getWriter();
		out.println("Square of added number is : "+sum);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}
	
}
