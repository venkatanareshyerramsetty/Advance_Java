package Test;
import javax.servlet.http.*;

public class MySessionlistener implements HttpSessionListener,
HttpSessionAttributeListener {

	public void Sessioncreated(HttpSessionEvent hse)
	{
		System.out.println("new Session created");
	}
	
	public void AttributeAdded(HttpSessionBindingEvent hb)
	{
		System.out.println("\t Name:"+hb.getName());
		System.out.println("\t value:"+hb.getValue());
		HttpSession hs =hb.getSession();
		System.out.println("\t New Value:"+hs.getAttribute(hb.getName()));
		
	}
	
	public void AttributeRemoved(HttpSessionBindingEvent hbe)
	{
		System.out.println("attribute removed from Session");
		System.out.println("\t Name:"+hbe.getName());
		System.out.println("\t value:"+hbe.getValue());
	}
}
