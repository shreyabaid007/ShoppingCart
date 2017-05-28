package cart;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;
public class  Demo
{
	public void m1() 
	{
		try
		{
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/TestMYDB");
		Connection conn = ds.getConnection();
		System.out.println(conn);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
