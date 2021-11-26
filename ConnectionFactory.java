package SWING;
import java.sql.*;


public class ConnectionFactory {
	Connection cn=null;

	public Connection getConn()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //REGISTER AND LOAD THE DRIVER
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","INVENTORY","INVENTORY"); //ESTABLISH THE CONNECTION
			
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return cn;
		
	}
	
			

}
