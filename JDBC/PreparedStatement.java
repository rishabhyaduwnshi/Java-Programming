import java.lang.*;
import java.util.*;
import java.sql.*;

class MyPreparedStatement 
{
    public static void main(String args[]) throws Exception 
	{
        	Class.forName("org.sqlite.JDBC");
        	Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//yadavr//Desktop//sqlite//university.db");

        	PreparedStatement stm = con.prepareStatement("select * from department where dept_number = ?");
        	Scanner sc = new Scanner(System.in);

	        System.out.println("Enter department number: ");
        	int dept_no = sc.nextInt();
        	stm.setInt(1, dept_no);
        	ResultSet rs = stm.executeQuery();

	        int dept_number;
        	String dept_name;

	        while (rs.next()) 
		{
            		dept_number = rs.getInt("dept_number");
            		dept_name = rs.getString("dept_name");

            		System.out.println(dept_number + " " + dept_name);
        	}

        	stm.close();
    	}
}
