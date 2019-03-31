package behavioral.command.drawing;

public class CEffectCommand implements Command 
{
  public void execute(Drawing drawing) 
  {
    System.out.println("�@ C �S��");
    drawing.processOther();
    drawing.processSome();
    drawing.processAnother();
  }
}
