package structural.adapter_object;

import java.util.Vector;

public class NoAdapterMain
{
  public static void main(String[] args) 
  {  
    Vector<Object> vector = new Vector<Object>();                      
                                                      
      for(int i = 0; i < 10; i++)   
          vector.addElement("клеє " + i); 

      ShowMessage.simpleShow(vector.elements());   
 }
}
