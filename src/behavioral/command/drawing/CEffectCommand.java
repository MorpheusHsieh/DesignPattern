package behavioral.command.drawing;

public class CEffectCommand implements Command 
{
  public void execute(Drawing drawing) 
  {
    System.out.println("§@ C ¯S®Ä");
    drawing.processOther();
    drawing.processSome();
    drawing.processAnother();
  }
}
