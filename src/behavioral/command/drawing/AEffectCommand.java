package behavioral.command.drawing;

public class AEffectCommand implements Command 
{
  public void execute(Drawing drawing) 
  {
    System.out.println("§@ A ¯S®Ä");
    drawing.processSome();
    drawing.processOther();
  }
}

