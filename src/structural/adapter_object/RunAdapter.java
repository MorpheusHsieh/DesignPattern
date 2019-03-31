package structural.adapter_object;

import java.util.ArrayList;

/*
 * 2012.03.08: From 
 *   http://www.javaworld.com.tw/confluence/display/designpattern/Adapter
 */
public class RunAdapter 
{
  public static void main(String[] args) 
  {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    for(int i = 0; i < 10; i++)
      arrayList.add("клеє " + i);
    ShowMessage.simpleShow(new IterAdapter(arrayList.iterator()));
  }
}