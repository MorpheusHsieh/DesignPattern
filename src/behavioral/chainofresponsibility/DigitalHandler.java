package behavioral.chainofresponsibility;

public class DigitalHandler extends Handler 
{
  DigitalHandler(Handler next) 
  {
    super(next);
  }    
  
  void handle(char c) 
  { 
    if(Character.isDigit(c)) 
    {
      System.out.println("Digit has been handled"); 
    }
    doNext(c);
  }
}

