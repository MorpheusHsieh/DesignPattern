package behavioral.chainofresponsibility;

public class CharacterHandler extends Handler 
{
  CharacterHandler(Handler next) 
  {
    super(next);
  }
  
  void handle(char c) 
  {
    if(Character.isLetter(c)) 
    {
      System.out.println("Character has been handled"); 
    }
    doNext(c);
  }
}

