package Test;
import java.sql.*;
import java.util.*;
public class Registration {

public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter the student roll no ");
		String rNo=sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:orcl2","scott","tiger");

		PreparedStatement ps=con.prepareStatement("select * from student9 where rNo=?");
		ps.setString(1, rNo);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println("Student Name"+rs.getString(2));
			System.out.println("Student Branch"+rs.getString(3));
			System.out.println("Student Address"+rs.getString(4));
			System.out.println("Student total marks"+rs.getString(5));
			System.out.println("Student percentage"+rs.getString(6));
			System.out.println("Student result"+rs.getString(7));
		}
		
		else {
			System.out.println("Invalid Sudent rollno");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
