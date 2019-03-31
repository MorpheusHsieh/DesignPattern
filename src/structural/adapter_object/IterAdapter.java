package structural.adapter_object;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

//�ϥ�Adapter�Ҧ�
public class IterAdapter implements Enumeration<Object> 
{
  private Iterator<Object> iterator;
  
  public IterAdapter(Iterator<Object> iterator) 
  {
    this.iterator = iterator;
  }
   
  // �౵����
  public boolean hasMoreElements() 
  {
    return iterator.hasNext();
  }
   
  public Object nextElement() throws NoSuchElementException 
  {
    return iterator.next();
  }
}
