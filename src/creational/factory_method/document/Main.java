package creational.factory_method.document;

public class Main 
{
  public static void main(String[] args) 
  {
      Editor editor = new RTFEditor();
                                                                              
      // �s�W�@�Ӥ��
      editor.newDocument();
      // �x�s�@�Ӥ��
      editor.saveDocument();
      // �����@�Ӥ��
      editor.closeDocument();
  }
}
