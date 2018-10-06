package Test;
import java.sql.*;

import org.eclipse.jdt.internal.compiler.util.CompoundNameVector;

public class DriverConnection {
	public static Connection getConnection()
	throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection
		("jdbc.oracle.thin.@localhost:1521:orcl2","scott","tiger");
		
		
	}	

}
