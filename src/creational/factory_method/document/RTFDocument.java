package creational.factory_method.document;

public class RTFDocument extends Document 
{
  public RTFDocument() 
  {
      System.out.println("�إ�RTF���");
  }
                                                                              
  public void open() {
      System.out.println("�}�Ҥ��");
  }
                                                                              
  public void save() {
      System.out.println("�x�s���");
  }
                                                                              
  public void close() {
      System.out.println("�������");
  }
}

