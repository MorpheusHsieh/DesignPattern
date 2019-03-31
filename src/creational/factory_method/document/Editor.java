package creational.factory_method.document;

public abstract class Editor 
{
  private Document doc;
  public abstract Document createDocument();
                                                                              
  public void newDocument() {
      doc = createDocument();
      doc.open();
  }
                                                                              
  public void saveDocument() {
      if(doc != null)
          doc.save();
  }
                                                                              
  public void closeDocument() {
      if(doc != null)
          doc.close();
  }
}
