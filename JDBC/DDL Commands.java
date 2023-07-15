import java.lang.*;
import java.sql.*;

class DDLCommands
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:C://Users//yadavr//Desktop//sqlite//university.db");
	
		Statement stm = connection.createStatement();

    //creating a table
		stm.executeUpdate("create table Temp(a integer, b float)");

    //deleting a table
		stm.executeUpdate("drop table Temp");
		
		stm.close();
		connection.close();
		
	}
}
