<%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8" isErrorPage = "true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body bgcolor = "yellow">
	<h1>Some error occured</h1>
	
	<%= exception.getMessage() %>
</body>
</html>
