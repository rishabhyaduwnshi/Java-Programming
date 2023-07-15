import java.lang.*;
import java.util.*;
import java.sql.*;

class DMLCommand
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//yadavr//Desktop//sqlite//university.db");

		Statement stm = con.createStatement();
		stm.executeUpdate("update department set dept_name = 'Chemical' where dept_number = 50");
	
		stm.close();
		con.close();
	}
}
