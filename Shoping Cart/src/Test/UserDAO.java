package Test;
import java.sql.*;

import org.apache.tomcat.dbcp.dbcp2.DriverConnectionFactory;

public class UserDAO {

	public boolean validate(String uname,String pass)
	{
        try
        {
        	Connection con=DriverConnection.getConnection();
        	Statement st=con.createStatement();
        	ResultSet rs =st.executeQuery("select * from registration9 where uname=\'"+uname+"\'and pass=\'"+pass+"\'");
        	return rs.next();
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        return false;
	}
}
