package bean;
import java.sql.*;
import bean.*;
import Test.*;

public class RegisterDao {
	public static boolean register(LoginBean u)
	{
		boolean status=false;
		try
		{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("select * from regform where uname=? and pass=?");
			ps.setString(1, u.getName());
			ps.setString(2, u.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next())status=true;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}

}
