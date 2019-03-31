package behavioral.chainofresponsibility;

public class Main
{
  public static void main(String[] args) 
  {
    Handler handler = 
    		new SymbolHandler(
    				new CharacterHandler(
    						new DigitalHandler(null)));
    
    handler.handle('A');
    handler.handle('1');
  }
}
