package creational.factory_method.document;

public class RTFDocument extends Document 
{
  public RTFDocument() 
  {
      System.out.println("建立RTF文件");
  }
                                                                              
  public void open() {
      System.out.println("開啟文件");
  }
                                                                              
  public void save() {
      System.out.println("儲存文件");
  }
                                                                              
  public void close() {
      System.out.println("關閉文件");
  }
}

