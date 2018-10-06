package Test;
import java.sql.*;
import java.io.*;
import java.util.*;

public class Insertionjava {

	public static void main(String[] args) {
		
		float total=0;
		float perc=0;
		String result="";
		String totM="";
		
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the Student rollno");
			String rNo=sc.next();
			System.out.println("enter the student name");
			String sName=sc.next();
			System.out.println("enter the student branch");
			String sBr=sc.next();
			System.out.println("enter the Student Address");
			String sAddr=sc.next();
			for(int i=0;i<6;i++)
			{
				int marks[]=new int[6];
				System.out.println("enter the subject marks");
				marks[i]=sc.nextInt();
				 total=total+marks[i];
				 totM= String.valueOf(total);
			}
			
			perc=total/6;
			String per=String.valueOf(perc);
			
			if(perc>=70 && perc<100)
			{
				result="distinction";
				System.out.println("distinction");
			}
			if(perc>60 && perc<70)
			{
				result="first class";
				System.out.println("first class");
			}
			
			if(perc>=50 && perc<60)
			{
				result="second class";
				System.out.println("second class");
			}
			if(perc>=35 && perc<50)
			{
				result="third class";
				System.out.println("third class");
			}
			
			if(perc<35)
			{
				result="fail";
				System.out.println("fail");
			}
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:orcl2","scott","tiger");
			PreparedStatement ps=con.prepareStatement
				("insert into student9 values(?,?,?,?,?,?,?)");
			
				ps.setString(1, rNo);
				ps.setString(2, sName);
				ps.setString(3, sBr);
				ps.setString(4, sAddr);
				ps.setString(5, totM);
				ps.setString(6, per);
				ps.setString(7, result);
				
				ResultSet rs=ps.executeQuery();	
				if(rs.next())
				{
					System.out.println("student registered");
				}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
