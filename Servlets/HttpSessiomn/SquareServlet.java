package com.rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		HttpSession session = request.getSession();
		int sum = (int)session.getAttribute("sum");
		sum = sum*sum;
		PrintWriter out = response.getWriter();
		out.println("Square of number is : " + sum);
	}
	
}
