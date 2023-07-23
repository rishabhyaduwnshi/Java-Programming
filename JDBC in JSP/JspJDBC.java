<%@ page language="java" contentType="text/html; charset=UTF-8"
         import ="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
</head>
<body bgcolor= "pink">
<h1>Hi</h1>

<%
    try {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite://Users//rishabh.yadav//Desktop//sql//university.db");
        String sql = "select * from department;";

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        int dept_number;
        String dept_name;

        out.println("fetching data from department table<br>");

        while (rs.next()) {
            dept_number = rs.getInt("dept_number");
            dept_name = rs.getString("dept_name");
            out.println(dept_number + " " + dept_name);
            out.println("<br>");
        }
        statement.close();
    }
    catch(Exception e)
    {
        out.println("Error" +e.getMessage());
    }
%>

</body>
</html>
