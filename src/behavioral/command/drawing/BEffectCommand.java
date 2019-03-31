package behavioral.command.drawing;

public class BEffectCommand implements Command 
{
  public void execute(Drawing drawing) 
  {
    System.out.println("§@ B ¯S®Ä");
    drawing.processOther();
    drawing.processAnother();
  }
}

