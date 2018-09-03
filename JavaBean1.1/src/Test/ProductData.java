package Test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class ProductData implements Serializable {
	
	private String pCode,pName;
	private int pPrice;
	public ProductData()
	{	}
	
	public String getCode()
	{
		return pCode;
	}
	
	public void setCode(String pCode)
	{
		this.pCode=pCode;
	}
     
	public String getName()
	{
     	return pName;
	}
	
	public void setName(String pName)
	{
		this.pName=pName;
	}
	
	public int getPrice()
	{
		return pPrice;
	}
	
	public void setQty(int pPrice)
	{
		this.pPrice=pPrice;
	}
}
