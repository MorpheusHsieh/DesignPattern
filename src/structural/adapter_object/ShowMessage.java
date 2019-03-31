package structural.adapter_object;

import java.util.Enumeration;

public class ShowMessage 
{   
  public static void simpleShow(Enumeration<Object> e) 
	{ 
	  Object tmp;
	  while(e.hasMoreElements()) 
	  {
	    tmp = e.nextElement();
	    System.out.println(tmp);
	  }
	}
}
