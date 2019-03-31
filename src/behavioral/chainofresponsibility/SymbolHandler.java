package behavioral.chainofresponsibility;

public class SymbolHandler extends Handler 
{
  SymbolHandler(Handler next) 
  {
    super(next);
  }
  
  void handle(char c) 
  {
    System.out.println("Symbol has been handled");
    doNext(c);
  }
}
