package behavioral.chainofresponsibility;

abstract public class Handler 
{
  protected Handler next;

  Handler(Handler next) { this.next = next; }    
  
  void doNext(char c) 
  {      
  	if (next != null) { next.handle(c); }
  }
  
  abstract void handle(char c);
}
