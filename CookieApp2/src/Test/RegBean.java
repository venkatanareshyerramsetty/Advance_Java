package Test;
import java.io.*;
public class RegBean implements Serializable {
	private String uName,pWord,fName,lName,addr,phNo,mailId;
	public void setUserName(String uName)
	{
		this.uName=uName;
	}
   public String getUserName()
   {
	   return uName;
   }
   public void setPassWord(String pWord)
   {
	   this.pWord=pWord;
	   
   }
   
   public String getPassWord()
   {
	   return pWord;
   }
   
   public void setFirstName(String fName)
   {
	   this.fName=fName;
   }
   
   public String getFirstName()
   {
	   return fName;
   }
   
   public void setLastName(String lName)
   {
	   this.lName=lName;
   }
   
   public String getLastName()
   {
	   return lName;
   }
   
   public void setAddress(String addr)
   {
	   this.addr=addr;
   }
   public String getAddress()
   {
	   return addr;
   }
   
   public void setphoneNo(String phNo)
   {
	   this.phNo=phNo;
   }
   
   public String getphoneNo ()
   {
	   return phNo;
   }
   
   public void setMailId(String mailId)
   {
	   this.mailId=mailId;
   }
   
   public String getmailId()
   {
	   return mailId;
   }
   
   
}
