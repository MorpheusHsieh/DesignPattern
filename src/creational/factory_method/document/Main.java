package creational.factory_method.document;

public class Main 
{
  public static void main(String[] args) 
  {
      Editor editor = new RTFEditor();
                                                                              
      // 新增一個文件
      editor.newDocument();
      // 儲存一個文件
      editor.saveDocument();
      // 關閉一個文件
      editor.closeDocument();
  }
}
