package Test;

import java.io.*;

public class RegData implements Serializable 
{
  private String uName,pWord,fName,lName,addr,mId;
  private long pNo;
  public RegData()
  {  }
  
  public void setName(String uName)
  {
	  this.uName=uName;
  }

  public String getNmae()
  {
	  return uName;
  }
  
  public void setWord(String pWord)
  {
	  this.pWord=pWord;
  }
  
  public String getWord()
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
  
  public void setPhoneNo(long pNo)
  {
	  this.pNo=pNo;
  }
  
  public long getPhoneNo()
  {
	  return pNo;
  }
  
  public void setMailId(String mId)
  {
	  this.mId=mId;
  }
  
  public String getMailId()
  {
	  return mId;
  }
}
