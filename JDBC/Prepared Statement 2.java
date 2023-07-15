import java.lang.*;
import java.util.*;
import java.sql.*;

class MyPreparedStatement 
{
    public static void main(String args[]) throws Exception 
	{
        	Class.forName("org.sqlite.JDBC");
        	Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//yadavr//Desktop//sqlite//university.db");

        	PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");
        	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student rollNo : ");
		int rollNo = sc.nextInt();	
	
		System.out.println("Enter Student Name : ");
		String student_name = sc.next(); 

		System.out.println("Enter Student City: ");
		String student_city = sc.next(); 

	        System.out.println("Enter department number : ");
        	int dept_no = sc.nextInt();

        	stm.setInt(1,rollNo);
		stm.setString(2,student_name);
		stm.setString(3,student_city);
		stm.setInt(4,dept_no);

		stm.executeUpdate();

        	stm.close();
		con.close();
    	}
}
