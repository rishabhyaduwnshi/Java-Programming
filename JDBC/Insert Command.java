import java.lang.*;
import java.util.*;
import java.sql.*;

class insertCommand
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//yadavr//Desktop//sqlite//university.db");

		Statement stm = con.createStatement();
		stm.executeUpdate("insert into department values(60,'Aeronautical')");
	
		stm.close();
		con.close();
	}
}
