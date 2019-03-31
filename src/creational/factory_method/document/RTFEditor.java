package creational.factory_method.document;

public class RTFEditor extends Editor 
{
  public Document createDocument() 
  {
      return new RTFDocument();
  }
}
