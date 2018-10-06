package bean;
import java.sql.*;
import bean.*;

public class RegisterDao {

	public static int register(RegForm u)
	{
		int status=0;
		try
		{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps =
			con.prepareStatement("insert into regform values(?,?,?,?,?,?)");
			ps.setString(1,u.getUserName());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getEmail());
			ps.setString(4,u.getFirstName());
			ps.setString(5,u.getLastName());
			ps.setString(6,u.getAddress());
			status=ps.executeUpdate();
						
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}
