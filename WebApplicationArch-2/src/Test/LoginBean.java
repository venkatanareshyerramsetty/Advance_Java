package Test;
import java.io.*;

public class LoginBean implements Serializable {
	private String name,password;
	    public String getName()
	    {
	    	return name;
	    }
	    
	    public void setName(String name)
	    {
	    	this.name=name;
	    }
	    
	    public String getPassword()
	    {
	    	return password;
	    }
	    
	    public void setPassword(String password)
	    {
	    	this.password=password;
	    }

}
