<%@ page language="java" contentType="text/html; charset=UTF-8"
     errorPage="error.jsp" pageEncoding="UTF-8"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddJSP</title>
</head>
<body bgcolor = "pink">
	
	<%
	
		int firstnum = Integer.parseInt(request.getParameter("num1"));
		int secondnum = Integer.parseInt(request.getParameter("num2"));
		int sum = firstnum+secondnum;
		out.println("Sum of the numbers is : "+sum);
		out.println("<br>");
		
		out.println(sum/0);
		
	%>

</body>
</html>
