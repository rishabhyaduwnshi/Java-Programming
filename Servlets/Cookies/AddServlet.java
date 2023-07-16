package com.rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
			int firstnum = Integer.parseInt(request.getParameter("num1"));
			int secondnum = Integer.parseInt(request.getParameter("num2"));
			int sum = firstnum+secondnum;
			
			
			Cookie cookie = new Cookie("sum", sum + ""); //for converting sum to string
			response.addCookie(cookie);
			
			response.sendRedirect("square");
				
		}
		
}
