import java.io.*;
import java.sql.*;

class conn
{
	Connection con;
	Statement st;
	
	conn()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:Students");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	

		}
		catch(Exception e){ }
	}
	
}


