package com.rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int sum = 0;
		Cookie[] cookies = request.getCookies();
		
		for(Cookie c : cookies)
		{
			if(c.getName().equals("sum"))
				sum = Integer.parseInt(c.getValue());
				
		}
		sum = sum*sum;
		
		PrintWriter out = response.getWriter();
		out.println("Square of number is : " + sum);
	}
	
}
